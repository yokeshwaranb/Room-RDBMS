package com.training.roomrdbms.entities;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Subject {

    @NonNull
    @PrimaryKey(autoGenerate = false)
    private String subjectName;

    public Subject(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
