package com.telusko;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {
    @Id
    private int Aid;
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
