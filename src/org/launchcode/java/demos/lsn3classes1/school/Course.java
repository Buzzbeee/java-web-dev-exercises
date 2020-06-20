package org.launchcode.java.demos.lsn3classes1.school;

import org.launchcode.java.demos.lsn3classes1.Student;
import org.launchcode.java.demos.lsn3classes1.school.Teacher;

import java.util.ArrayList;

public class Course {

    String name;
    Teacher teacher;
    ArrayList<Student> students;

    Course(String name, Teacher teacher, ArrayList<Student> students) {
        this.name = name;
        this.teacher = teacher;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
