package com.cleanup.todoc.model;

import static androidx.room.OnConflictStrategy.REPLACE;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ProjectDao {

    @Insert(onConflict = REPLACE)
    void insert(Project project);

    @Delete
    void delete(Project project);

    @Delete //all
    void reset(List<Project> projects);

    @Query("SELECT * FROM Project")
    List<Project> getAll();
}
