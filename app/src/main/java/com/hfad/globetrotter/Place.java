package com.hfad.globetrotter;

public class Place {
    private int place_id;
    private String iata_code;
    private String name;
    private String type;
    private String skyscanner_code;
    private String city_name;
    private String city_id;
    private String country_name;

    public int getPlace_id() {
        return place_id;
    }

    public void setPlace_id(int place_id) {
        this.place_id = place_id;
    }

    public String getIata_code() {
        return iata_code;
    }

    public void setIata_code(String iata_code) {
        this.iata_code = iata_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSkyscanner_code() {
        return skyscanner_code;
    }

    public void setSkyscanner_code(String skyscanner_code) {
        this.skyscanner_code = skyscanner_code;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    @Override
    public String toString() {
        return "Place{" +
                "place_id=" + place_id +
                ", iata_code='" + iata_code + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", skyscanner_code='" + skyscanner_code + '\'' +
                ", city_name='" + city_name + '\'' +
                ", city_id='" + city_id + '\'' +
                ", country_name='" + country_name + '\'' +
                '}';
    }
}



