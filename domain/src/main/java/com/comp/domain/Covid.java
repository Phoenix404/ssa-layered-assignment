package com.comp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity() //tells Hibernate to make a table based on this class
public class Covid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String location;
    private int new_cases;
    private int new_deaths;
    private int total_cases;
    private int total_deaths;
    private Date date;

    public Covid() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNew_cases() {
        return new_cases;
    }

    public void setNew_cases(int new_cases) {
        this.new_cases = new_cases;
    }

    public int getNew_deaths() {
        return new_deaths;
    }

    public void setNew_deaths(int new_deaths) {
        this.new_deaths = new_deaths;
    }

    public int getTotal_cases() {
        return total_cases;
    }

    public void setTotal_cases(int total_cases) {
        this.total_cases = total_cases;
    }

    public int getTotal_deaths() {
        return total_deaths;
    }

    public void setTotal_deaths(int total_deaths) {
        this.total_deaths = total_deaths;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDate(String date) {
        this.date = Date.valueOf(date);
    }

    @Override
    public String toString() {
        return "Covid{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", new_cases=" + new_cases +
                ", new_deaths=" + new_deaths +
                ", total_cases=" + total_cases +
                ", total_deaths=" + total_deaths +
                ", date=" + date +
                '}';
    }
}
