package com.hfad.globetrotter;

import java.util.List;

public class CarrierResponse {
    private List<Carrier> Carriers;

    public CarrierResponse(List<Carrier> carriers) {
        this.Carriers = carriers;
    }

    public List<Carrier> getCarriers() {
        return Carriers;
    }

    public void setCarriers(List<Carrier> carriers) {
        this.Carriers = carriers;
    }
}
