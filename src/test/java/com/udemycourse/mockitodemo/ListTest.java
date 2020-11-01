package com.udemycourse.mockitodemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


import static org.junit.jupiter.api.Assertions.*;

import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


public class ListTest {

    @Test
    public void test(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(10);
        assertEquals(10,listMock.size());
    }

    @Test
    public void test_multilpleReturns(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(10).thenReturn(20);
        assertEquals(10,listMock.size());
        assertEquals(20,listMock.size());
    }

    @Test
    public void testGet_Specific(){
        List listMock = mock(List.class);
        when(listMock.get(Mockito.anyInt())).thenReturn("Shiv");
        assertEquals("Shiv",listMock.get(0));
        assertEquals("Shiv",listMock.get(1));
    }
}


