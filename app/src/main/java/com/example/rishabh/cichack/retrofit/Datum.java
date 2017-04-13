
package com.example.rishabh.cichack.retrofit;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Datum implements Parcelable
{

    private String crop;
    private String seedcost;
    private String fertilizer;
    private String irrigation;
    private String area;
    private String cost;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8959335358240045778L;

    protected Datum(Parcel in) {
        crop = in.readString();
        seedcost = in.readString();
        fertilizer = in.readString();
        irrigation = in.readString();
        area = in.readString();
        cost = in.readString();
    }

    public static final Creator<Datum> CREATOR = new Creator<Datum>() {
        @Override public Datum createFromParcel(Parcel in) {
            return new Datum(in);
        }

        @Override public Datum[] newArray(int size) {
            return new Datum[size];
        }
    };

    public String getCrop() {
        return crop;
    }

    public void setCrop(String crop) {
        this.crop = crop;
    }

    public String getSeedcost() {
        return seedcost;
    }

    public void setSeedcost(String seedcost) {
        this.seedcost = seedcost;
    }

    public String getFertilizer() {
        return fertilizer;
    }

    public void setFertilizer(String fertilizer) {
        this.fertilizer = fertilizer;
    }

    public String getIrrigation() {
        return irrigation;
    }

    public void setIrrigation(String irrigation) {
        this.irrigation = irrigation;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override public int describeContents() {
        return 0;
    }

    @Override public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(crop);
        parcel.writeString(seedcost);
        parcel.writeString(fertilizer);
        parcel.writeString(irrigation);
        parcel.writeString(area);
        parcel.writeString(cost);
    }
}
