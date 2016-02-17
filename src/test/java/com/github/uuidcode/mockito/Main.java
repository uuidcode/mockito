package com.github.uuidcode.mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Main {
    @Mock
    private Module mockModule;

    @Spy
    private Module spyModule;

    @Test
    public void test() {
        mockModule.setName("test");
        System.out.println(this.mockModule.getName());

        spyModule.setName("test");
        System.out.println(this.spyModule.getName());
    }


}
