package com.jason.student.dao;

import com.jason.student.domain.ClassRoom;
import com.jason.student.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.text.CollationElementIterator;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jason
 * @date 2019-05-07  14:24:34
 */
@Repository
public class StudentDao {
    private static Map<Integer, Student> students = null;

    @Autowired
    private ClassRoomDao classRoomDao;

    static{
        students = new HashMap<Integer, Student>();
        students.put(10001,new Student(10001,"张三","zhangsan@163.com",1,new ClassRoom(101,"java开发一班")));
        students.put(10002,new Student(10002,"李四","lisi@163.com",0,new ClassRoom(102,"java开发二班")));
        students.put(10003,new Student(10003,"王五","wangwu@163.com",1,new ClassRoom(103,"java开发三班")));
        students.put(10004,new Student(10004,"赵六","zhaoliu@163.com",0,new ClassRoom(104,"java开发四班")));
        students.put(10005,new Student(10005,"田七","tianqi@163.com",1,new ClassRoom(105,"java开发五班")));
    }

    private static Integer initId = 10006;

    public void save(Student student){
        if(student.getId() == null){
            student.setId(initId++);
        }
        student.setClassRoom(classRoomDao.getClassRoom(student.getClassRoom().getId()));
        students.put(student.getId(), student);
    }

    public Collection<Student> getAll(){
        return students.values();
    }

    public Student get(Integer id){
        return students.get(id);
    }

    public void delete(Integer id){
        students.remove(id);
    }
}
