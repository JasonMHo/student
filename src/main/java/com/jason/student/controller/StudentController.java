package com.jason.student.controller;

import com.jason.student.dao.ClassRoomDao;
import com.jason.student.dao.StudentDao;
import com.jason.student.domain.ClassRoom;
import com.jason.student.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collection;

/**
 * @author jason
 * @date 2019-05-07  14:13:56
 */
@Controller
public class StudentController {

    @Autowired
    private StudentDao studentDao;
    @Autowired
    private ClassRoomDao classRoomDao;

    @GetMapping("/stus")
    public String list(Model model){
        Collection<Student> students = studentDao.getAll();
        model.addAttribute("stus",students);

        return "stu/list";
    }

    @GetMapping("/stu")
    public String toAddPage(Model model){
        Collection<ClassRoom> classRooms = classRoomDao.getClassRooms();
        model.addAttribute("classRooms", classRooms);

        return "stu/add";
    }

    @PostMapping("/stu")
    public String addStudent(Student student){
        System.out.println("保存 student 的信息： =====》" + student);
        studentDao.save(student);
        return "redirect:/stus";
    }
}
