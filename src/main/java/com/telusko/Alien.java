package com.telusko;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// normally the table name and column name is decide on the basis of class name and variale/object name. but using @Table and @Column
// Using @table we can change the table name and @column will change the column name.
@Entity
@Table(name = "alien_data")
public class Alien {
    @Id
    @Column(name = "a_id")
    private int Aid;
    @Column(name = "a_name")
    private String Aname;
    private String tech;

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public String getAname() {
        return Aname;
    }

    public void setAname(String aname) {
        Aname = aname;
    }

    public int getAid() {
        return Aid;
    }

    public void setAid(int aid) {
        Aid = aid;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "Aid=" + Aid +
                ", Aname='" + Aname + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }
}
