package com.training.roomrdbms;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.training.roomrdbms.entities.Director;
import com.training.roomrdbms.entities.School;
import com.training.roomrdbms.entities.Student;
import com.training.roomrdbms.entities.Subject;
import com.training.roomrdbms.entities.relations.StudentSubjectCrossRef;

@Database(
        entities = {
                School.class,
                Student.class,
                Director.class,
                Subject.class,
                StudentSubjectCrossRef.class
        },
        version = 1
)
public abstract class SchoolDatabase extends RoomDatabase {

    public abstract SchoolDao schoolDao();

    private static SchoolDatabase INSTANCE;
    private final static String DB_NAME = "school_db";

    public static synchronized SchoolDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context, SchoolDatabase.class, DB_NAME).allowMainThreadQueries().build();
        }
        return INSTANCE;
    }
}
