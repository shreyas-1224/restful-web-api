package com.example.restfulwebservices.user;

import java.time.LocalDate;

public class User {
    private int id;
    private String name ;
    private LocalDate birthDate;


    public User(int id, String name, LocalDate birthDate) {
        super();
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", birthDate=" + birthDate +
                ", name='" + name + '\'' +
                '}';
    }
}
