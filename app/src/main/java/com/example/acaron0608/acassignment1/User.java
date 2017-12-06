package com.example.acaron0608.acassignment1;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
/**
 * Created by acaron0608 on 11/23/2017.
 */
@Entity
public class User {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String userName;
    public String password;

    public User(int id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

}

