package com.github.uuidcode.mockito;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Test2 {
    public static final String NAME = "TEST";

    @Spy
    private Module module;

    @InjectMocks
    private Project project;

    @Test
    public void test() {
        this.project.setData("data").setName("name");

        assertThat(this.project.getData(), is("data"));
        assertThat(this.project.getName(), is("name"));
        assertThat(this.project.getModule().getName(), is(nullValue()));

        this.module.setName(NAME);

        assertThat(this.project.getModule().getName(), is(NAME));
    }
}
