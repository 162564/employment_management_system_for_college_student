package per.sosg.service;

import per.sosg.bean.Student;

public interface StudentService {
    /*根据sid查询学生信息*/
    Student selectBysId(Integer sid);
    /*插入学生信息*/
    int insertStudent(Student student);
    /*根据sid更新学生信息*/
    int updateStudent(Student student);
    /*根据id删除学生信息*/
    int deleteStudent(Integer sid);
}
