package com.github.uuidcode.mockito;

public class Module {
    private String name;
    private String version;
    
    public String getVersion() {
        return this.version;
    }
    
    public Module setVersion(String version) {
        this.version = version;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Module setName(String name) {
        this.name = name;
        return this;
    }
}
