package com.training.roomrdbms.entities;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Student {

    @NonNull
    @PrimaryKey(autoGenerate = false)
    private String studentName;
    private int semester;
    private String schoolName;

    public Student(String studentName, int semester, String schoolName) {
        this.studentName = studentName;
        this.semester = semester;
        this.schoolName = schoolName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
