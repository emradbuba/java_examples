package io.github.guit4rfre4k.examples.mockito;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentMatcher;

import static org.mockito.Mockito.*;

public class MockitoStudentTest {

    private MockitoStudent studentMock;

    @Before
    public void setUp() {
        studentMock = mock(MockitoStudent.class, "InitName");
    }

    @Test
    public void testSetName() {
        studentMock.setName("Name1");
        studentMock.setName("Name2");
        verify(studentMock, times(1)).setName("Name1"); // verify that setName("Name1") was invoked once
        verify(studentMock, times(1)).setName("Name2"); // verify that setName("Name2") was invoked once
        studentMock.setName("Name1");
        verify(studentMock, atLeast(1)).setName("Name1");  // verify that setName("Name1") was invoked at least once
    }

    @Test
    public void testSetName2() {
        when(studentMock.getName()).thenReturn("Radek");
        Assert.assertEquals("Radek", studentMock.getName());
        doNothing().when(studentMock).setName(argThat(s -> s.startsWith("A")));


    }


}