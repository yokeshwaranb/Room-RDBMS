package com.training.roomrdbms.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class School {
    @PrimaryKey(autoGenerate = false)
    private String schoolName;

    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
