package com.jason.student.dao;

import com.jason.student.domain.ClassRoom;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jason
 * @date 2019-05-07  14:26:14
 */
@Repository
public class ClassRoomDao {

    private static Map<Integer, ClassRoom> classRooms = null;

    static{
        classRooms = new HashMap<Integer, ClassRoom>();
        classRooms.put(101, new ClassRoom(101, "java开发一班"));
        classRooms.put(102, new ClassRoom(102, "java开发二班"));
        classRooms.put(103, new ClassRoom(103, "java开发三班"));
        classRooms.put(104, new ClassRoom(104, "java开发四班"));
        classRooms.put(105, new ClassRoom(105, "java开发五班"));
    }

    public Collection<ClassRoom> getClassRooms(){
        return classRooms.values();
    }

    public ClassRoom getClassRoom(Integer id){
        return classRooms.get(id);
    }
}
