package per.sosg.bean;

import lombok.Data;

import java.io.File;

@Data
public class Student {
    private Integer sid;
    private String sname;
    private String telephone;
    private String school;
    private String company;
    private String address;
    private boolean state;
    private File information;
}
