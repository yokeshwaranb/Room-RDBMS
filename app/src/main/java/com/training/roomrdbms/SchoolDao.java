package com.training.roomrdbms;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;

import com.training.roomrdbms.entities.Director;
import com.training.roomrdbms.entities.School;
import com.training.roomrdbms.entities.Student;
import com.training.roomrdbms.entities.relations.SchoolAndDirector;
import com.training.roomrdbms.entities.relations.SchoolWithStudents;
import com.training.roomrdbms.entities.relations.StudentWithSubjects;
import com.training.roomrdbms.entities.relations.SubjectWithStudents;

import java.util.List;

@Dao
interface SchoolDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertSchool(School school);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertDirector(Director director);

    @Transaction
    @Query("SELECT * FROM school WHERE schoolName = :schoolName")
    List<SchoolAndDirector> getSchoolAndDirectorWithSchoolName(String schoolName);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertDirector(Student student);

    @Transaction
    @Query("SELECT * FROM school WHERE schoolName = :schoolName")
    List<SchoolWithStudents> getSchoolWithStudents(String schoolName);
}
