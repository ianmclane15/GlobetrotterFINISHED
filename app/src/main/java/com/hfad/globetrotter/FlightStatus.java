package com.hfad.globetrotter;

        import java.util.ArrayList;
        import java.util.List;

public class FlightStatus {
    private List<Quote> quotes = new ArrayList<Quote>();
    private List<Place> places = new ArrayList<Place>();
    private List<Carrier> carriers = new ArrayList<Carrier>();
    private List<Currency> currency = new ArrayList<Currency>();

    public List<Quote> getQuotes() {
        return quotes;
    }

    public void setQuotes(List<Quote> quotes) {
        this.quotes = quotes;
    }

    public List<Place> getPlaces() {
        return places;
    }

    public void setPlaces(List<Place> places) {
        this.places = places;
    }

    public List<Carrier> getCarriers() {
        return carriers;
    }

    public void setCarriers(List<Carrier> carriers) {
        this.carriers = carriers;
    }

    public List<Currency> getCurrency() {
        return currency;
    }

    public void setCurrency(List<Currency> currency) {
        this.currency = currency;
    }
}


