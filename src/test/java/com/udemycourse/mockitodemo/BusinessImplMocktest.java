package com.udemycourse.mockitodemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BusinessImplMocktest {
    @Test
    void findTheGreatestFromAllData() {
        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{1,25,6,32,67});

        BusinessImpl business = new BusinessImpl(dataServiceMock);
        int greatestNo = business.findTheGreatestFromAllData();
        assertEquals(67,greatestNo);
    }

    @Test
    void findTheGreatestFromOneData() {
        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{573});

        BusinessImpl business = new BusinessImpl(dataServiceMock);
        int greatestNo = business.findTheGreatestFromAllData();
        assertEquals(573,greatestNo);
    }
}
