package com.training.roomrdbms.entities.relations;

import androidx.annotation.NonNull;
import androidx.room.Entity;

@Entity(primaryKeys = {"studentName", "subjectName"})
public class StudentSubjectCrossRef {

    @NonNull
    public String studentName;
    @NonNull
    public String subjectName;

}
