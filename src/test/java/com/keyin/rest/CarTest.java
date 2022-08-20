package com.keyin.rest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void testCarInfo1(){
        Car CarInfoTest = new Car();

        CarInfoTest.setCarMake("Toyota");
        System.out.println(CarInfoTest.getCarMake());

        Assertions.assertNull(CarInfoTest.getCarMake());

    }

    @Test
    public void testCarInfo2(){
        Car CarInfoTest = new Car();

        CarInfoTest.setCarModel("Rav 4");
        System.out.println(CarInfoTest.getCarModel());

        Assertions.assertNotNull(CarInfoTest.getCarModel());

    }

    @Test
    public void testCarInfo3(){
        Car CarInfoTest = new Car();

        CarInfoTest.setCarYear("2022");
        System.out.println(CarInfoTest.getCarYear());

        Assertions.assertNotEquals(CarInfoTest.getCarYear(),"2000");

    }

    @Test
    public void testCarInfo4(){
        Car CarInfoTest = new Car();

        CarInfoTest.setCarPrice("38,000");
        System.out.println(CarInfoTest.getCarPrice());

        Assertions.assertEquals(CarInfoTest.getCarPrice(), "37,000");

    }

    @Test
    public void testCarInfo5(){
        Car CarInfoTest = new Car();

        CarInfoTest.setDealerLocation("St. John's");
        System.out.println(CarInfoTest.getDealerLocation());

        Assertions.assertNotEquals(CarInfoTest.getDealerLocation(),"Mount Pearl");

    }

    @Test
    public void testCarInfo6(){
        Car CarInfoTest = new Car();

        CarInfoTest.setCarKm("0");
        System.out.println(CarInfoTest.getCarKm());

        Assertions.assertEquals(CarInfoTest.getCarKm(),"0");

    }

}
