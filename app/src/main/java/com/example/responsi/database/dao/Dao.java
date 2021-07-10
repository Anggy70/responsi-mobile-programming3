package com.example.responsi.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.responsi.database.entity.Person;

@androidx.room.Dao
public interface Dao {
    @Query("SELECT * FROM Person where email= :email and password= :password")
    Person getUser(String email, String password);

    @Insert
    void insert(Person appDao);
}
