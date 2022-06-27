package com.training.roomrdbms.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Director")
public class Director {
    @PrimaryKey(autoGenerate = false)
    private String directorName;

    public Director(String directorName) {
        this.directorName = directorName;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }
}
