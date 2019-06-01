package com.hfad.globetrotter;

        import java.util.ArrayList;
        import java.util.List;


public class Outboundleg {
    private List<Integer> carrierIds = new ArrayList<Integer>();
    private int originId;
    private int destination_id;
    private String depaturedate;

    public List<Integer> getCarrierIds() {
        return carrierIds;
    }

    public void setCarrierIds(List<Integer> carrierIds) {
        this.carrierIds = carrierIds;
    }

    public int getOriginId() {
        return originId;
    }

    public void setOriginId(int originId) {
        this.originId = originId;
    }

    public int getDestination_id() {
        return destination_id;
    }

    public void setDestination_id(int destination_id) {
        this.destination_id = destination_id;
    }

    public String getDepaturedate() {
        return depaturedate;
    }

    public void setDepaturedate(String depaturedate) {
        this.depaturedate = depaturedate;
    }

    @Override
    public String toString() {
        return "Outboundleg{" +
                "carrierIds=" + carrierIds +
                ", originId=" + originId +
                ", destination_id=" + destination_id +
                ", depaturedate='" + depaturedate + '\'' +
                '}';
    }
}

