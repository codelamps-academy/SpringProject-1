package com.blackspring.spring.demo.models;

public class LocationStats {

    // MEMBUAT ATTRIBUTE
    private String state;
    private String country;
    private int latestTotalCases;

    // MEMBUAT GETTER DAN SETTER
    public String getState(){
        return state;
    }

    public void setState(String state){
        this.state = state;
    }

    public String getCountry(){
        return country;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public int getLatestTotalCases(){
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases){
        this.latestTotalCases = latestTotalCases;
    }

    // OVERRIDE TO STRING


    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                '}';
    }
}
