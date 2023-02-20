package per.sosg.service.impl;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import per.sosg.bean.Student;
import per.sosg.dao.StudentDao;
import per.sosg.service.StudentService;

@Service

public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;
    @Override
    public Student selectBysId(Integer sid) {
        return studentDao.selectBysId(sid);
    }

    @Override
    public int insertStudent(Student student) {
        return studentDao.insertStudent(student);
    }

    @Override
    public int updateStudent(Student student) {
        return studentDao.updateStudent(student);
    }

    @Override
    public int deleteStudent(Integer sid) {
        return studentDao.deleteStudent(sid);
    }
}
