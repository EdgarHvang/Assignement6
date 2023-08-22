package edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model;

import java.time.LocalDate;
import java.util.Date;

public class Student {
    private String name;
    private String studentId;
    private LocalDate dateOfAdminssion;

    public Student(String name, String studentId, LocalDate dateOfAdminssion) {
        this.name = name;
        this.studentId = studentId;
        this.dateOfAdminssion = dateOfAdminssion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public LocalDate getDateOfAdminssion() {
        return dateOfAdminssion;
    }

    public void setDateOfAdminssion(LocalDate dateOfAdminssion) {
        this.dateOfAdminssion = dateOfAdminssion;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId='" + studentId + '\'' +
                ", dateOfAdminssion='" + dateOfAdminssion + '\'' +
                '}';
    }
}
