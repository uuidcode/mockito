package com.github.uuidcode.mockito;

public class Project {
    private String name;
    private String data;
    private Module module;

    public Module getModule() {
        return this.module;
    }

    public Project setModule(Module module) {
        this.module = module;
        return this;
    }

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
