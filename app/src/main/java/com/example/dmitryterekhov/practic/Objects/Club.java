package com.example.dmitryterekhov.practic.Objects;
public class Club {
    protected String name;
    protected String information;

    public Club(String name, String information) {
        this.name = name;
        this.information = information;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}