package per.sosg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"per.sosg.dao"})
public class SystemOfStudentGraduateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemOfStudentGraduateApplication.class, args);
    }

}
