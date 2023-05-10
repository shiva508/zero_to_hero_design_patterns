package com.pool;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> students;

    public StudentService() {
        students=new ArrayList<>();
    }
    public StudentService(List<Student> students) {
        this.students = students;
    }

    public void loadStudents(){
        students.add(new Student("Shiva",508));
        students.add(new Student("Nitya",504));
        students.add(new Student("Geetha",501));
        students.add(new Student("Madhu",503));
    }

    public List<Student> getStudents() {
        return students;
    }
}
