package com.training.roomrdbms.entities;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Director")
public class Director {

    @NonNull
    @PrimaryKey(autoGenerate = false)
    private String directorName;
    private String schoolName;

    public Director(@NonNull String directorName, String schoolName) {
        this.directorName = directorName;
        this.schoolName = schoolName;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
