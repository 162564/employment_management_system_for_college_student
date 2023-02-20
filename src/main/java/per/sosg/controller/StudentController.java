package per.sosg.controller;

import jakarta.annotation.Resource;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import per.sosg.bean.Student;
import per.sosg.service.StudentService;

@Controller
public class StudentController {
    @Resource
    private StudentService studentService;

    @ResponseBody
    @GetMapping("/student/find")
    private Student find(Integer sid){
        return studentService.selectBysId(sid);
    }

    @ResponseBody
    @PostMapping("/student/insert")
    private Integer insert( Integer sid, String sname){
        Student student = new Student();
        student.setSid(sid);
        student.setSname(sname);
        return studentService.insertStudent(student);
    }
}

