package com.github.uuidcode.mockito;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Test1 {
    public static final String NAME = "hello";

    @Mock
    private Module mockModule;

    @Spy
    private Module spyModule;

    @Test
    public void test() {
        mockModule.setName(NAME);
        assertThat(mockModule.getName(), is(nullValue()));

        when(this.mockModule.getName()).thenReturn(NAME);
        assertThat(mockModule.getName(), is(NAME));

        spyModule.setName(NAME);
        assertThat(spyModule.getName(), is(NAME));

        when(this.spyModule.getVersion()).thenReturn("1.0");
        this.spyModule.setVersion("2.0");
        assertThat(this.spyModule.getVersion(), is("1.0"));
    }
}
