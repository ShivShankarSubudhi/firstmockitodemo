package com.udemycourse.mockitodemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


import static org.junit.jupiter.api.Assertions.*;

import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.mockito.junit.MockitoJUnitRunner;

@ExtendWith(SpringExtension.class)
public class BusinessImplMockAnnotationsTest {

    @Mock
    DataService dataServiceMock;

    @InjectMocks
    BusinessImpl business;

    @Test
    void findTheGreatestFromAllData() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{1,25,6,32,67});
        assertEquals(67, business.findTheGreatestFromAllData());
    }

    @Test
    void findTheGreatestFromOneData() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{573});
        assertEquals(573, business.findTheGreatestFromAllData());
    }

    @Test
    void findTheGreatestFromTwoData() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{34,98});
        assertEquals(98, business.findTheGreatestFromAllData());
    }

    @Test
    void findTheGreatestFromNoData() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{});
        assertEquals(Integer.MIN_VALUE, business.findTheGreatestFromAllData());
    }


}
