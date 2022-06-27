package com.training.roomrdbms.entities.relations;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.training.roomrdbms.entities.School;
import com.training.roomrdbms.entities.Student;

import java.util.List;

public class SchoolWithStudents {

    @Embedded
    public School school;

    @Relation(parentColumn = "schoolName", entityColumn = "schoolName")
    public List<Student> students;

}
