package com.training.roomrdbms.entities.relations;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.training.roomrdbms.entities.Student;
import com.training.roomrdbms.entities.Subject;

import java.util.List;

public class SubjectWithStudents {
    @Embedded
    public Subject subject;

    @Relation(
            parentColumn = "subjectName",
            entityColumn = "studentName",
            associateBy =  @Junction(StudentSubjectCrossRef.class)
    )
    public List<Student> students;
}
