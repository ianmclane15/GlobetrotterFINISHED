package com.hfad.globetrotter;

import android.os.Parcel;
import android.os.Parcelable;

public class Carrier implements Parcelable {
    private int CarrierId;
    private String Name;
    private String origin;
    private String destination;
    private String departDate;
    private String returnDate;

    public int getCarrierId() {
        return CarrierId;
    }

    public void setCarrierId(int CarrierId) {
        this.CarrierId = CarrierId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public String toString() {
        return "Carrier{" +
                "CarrierId=" + CarrierId +
                ", name='" + Name + '\'' +
                '}';
    }

    protected Carrier(Parcel in) {
        CarrierId = in.readInt();
        Name = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(CarrierId);
        dest.writeString(Name);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Carrier> CREATOR = new Parcelable.Creator<Carrier>() {
        @Override
        public Carrier createFromParcel(Parcel in) {
            return new Carrier(in);
        }

        @Override
        public Carrier[] newArray(int size) {
            return new Carrier[size];
        }
    };
}

