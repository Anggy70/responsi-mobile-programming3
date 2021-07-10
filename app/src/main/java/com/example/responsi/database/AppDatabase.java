package com.example.responsi.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.responsi.database.entity.Person;

@Database(entities = {Person.class},version = 1,exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract Dao getUserDao();
}
