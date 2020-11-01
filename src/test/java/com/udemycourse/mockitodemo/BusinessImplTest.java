package com.udemycourse.mockitodemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BusinessImplTest {

    @Test
    void findTheGreatestFromAllData() {
        BusinessImpl business = new BusinessImpl(new DataServiceStub());
        int greatestNo = business.findTheGreatestFromAllData();
        assertEquals(4,greatestNo);
    }
}

class DataServiceStub implements DataService {

    @Override
    public int[] retrieveAllData(){
        return new int[] {1,2,4,3};
    }
}