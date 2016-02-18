package com.github.uuidcode.mockito;

public class Project {
    private String name;
    private String data;

    public String getData() {
        return this.data;
    }

    public Project setData(String data) {
        this.data = data;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Project setName(String name) {
        this.name = name;
        return this;
    }
}
