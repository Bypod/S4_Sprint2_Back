package com.keyin.rest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String carMake;
    private String carModel;
    private String carYear;
    private String carPrice;
    private String dealerLocation;
    private String carKm;

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarYear() {
        return carYear;
    }

    public void setCarYear(String carYear) {
        this.carYear = carYear;
    }

    public String getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(String carPrice) {
        this.carPrice = carPrice;
    }

    public String getDealerLocation() {
        return dealerLocation;
    }

    public void setDealerLocation(String dealerLocation) {
        this.dealerLocation = dealerLocation;
    }

    public String getCarKm() {
        return carKm;
    }

    public void setCarKm(String carKm) {
        this.carKm = carKm;
    }

    public long getId(){return id;}
}
