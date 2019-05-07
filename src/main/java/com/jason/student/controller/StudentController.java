package com.jason.student.controller;

import com.jason.student.dao.StudentDao;
import com.jason.student.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @author jason
 * @date 2019-05-07  14:13:56
 */
@Controller
public class StudentController {

    @Autowired
    private StudentDao studentDao;

    @GetMapping("/stus")
    public String list(Model model){
        Collection<Student> students = studentDao.getAll();
        model.addAttribute("stus",students);

        return "stu/list";
    }
}
