package com.training.roomrdbms.entities.relations;


import androidx.room.Embedded;
import androidx.room.Relation;

import com.training.roomrdbms.entities.Director;
import com.training.roomrdbms.entities.School;

public class SchoolAndDirector {
    @Embedded
    public School school;

    @Relation(parentColumn = "schoolName", entityColumn = "schoolName")
    public Director director;

}
