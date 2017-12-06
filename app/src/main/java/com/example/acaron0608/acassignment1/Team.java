package com.example.acaron0608.acassignment1;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
/**
 * Created by acaron0608 on 12/6/2017.
 */
@Entity
public class Team {
    @PrimaryKey
    public int id;
    public String teamName;
    public boolean inviteOnly = false;
    public String description;

    public Team(int id, String teamName, boolean inviteOnly, String description)
    {
        this.id = id;
        this.teamName = teamName;
        this.inviteOnly = inviteOnly;
        this.description = description;
    }
}
