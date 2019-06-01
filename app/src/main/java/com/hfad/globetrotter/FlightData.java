package com.hfad.globetrotter;

import java.net.URL;

class LAXFlightData {
    private String fly_from;
    private int v;

    private String date_from;
    private String date_to;
    private String partner;
    private int adults;
    private int children;
    private int infants;
    private String currency;

    public String getFly_from() {
        return fly_from;
    }

    public void setFly_from(String fly_from) {
        this.fly_from = fly_from;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public String getDate_from() {
        return date_from;
    }

    public void setDate_from(String date_from) {
        this.date_from = date_from;
    }

    public String getDate_to() {
        return date_to;
    }

    public void setDate_to(String date_to) {
        this.date_to = date_to;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public int getAdults() {
        return adults;
    }

    public void setAdults(int adults) {
        this.adults = adults;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public int getInfants() {
        return infants;
    }

    public void setInfants(int infants) {
        this.infants = infants;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "FlightData{" +
                "fly_from='" + fly_from + '\'' +
                ", v=" + v +
                ", date_from='" + date_from + '\'' +
                ", date_to='" + date_to + '\'' +
                ", partner='" + partner + '\'' +
                ", adults=" + adults +
                ", children=" + children +
                ", infants=" + infants +
                ", currency='" + currency + '\'' +
                '}';
    }
}


