package com.github.uuidcode.mockito;

import java.util.List;

public class Module {
    private List<String> itemList;
    private String name;

    public String getName() {
        return this.name;
    }

    public Module setName(String name) {
        this.name = name;
        return this;
    }

    public List<String> getItemList() {
        return this.itemList;
    }

    public Module setItemList(List<String> itemList) {
        this.itemList = itemList;
        return this;
    }
}
