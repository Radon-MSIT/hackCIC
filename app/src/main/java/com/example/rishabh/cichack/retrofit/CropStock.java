
package com.example.rishabh.cichack.retrofit;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CropStock implements Parcelable
{

    private String stutus;
    private String totalCost;
    private String noOfCrops;
    private String region;
    private ArrayList<Datum> data = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8902645174905269085L;

    protected CropStock(Parcel in) {
        stutus = in.readString();
        totalCost = in.readString();
        noOfCrops = in.readString();
        region = in.readString();
        data = in.createTypedArrayList(Datum.CREATOR);
    }

    public static final Creator<CropStock> CREATOR = new Creator<CropStock>() {
        @Override public CropStock createFromParcel(Parcel in) {
            return new CropStock(in);
        }

        @Override public CropStock[] newArray(int size) {
            return new CropStock[size];
        }
    };

    public String getStutus() {
        return stutus;
    }

    public void setStutus(String stutus) {
        this.stutus = stutus;
    }

    public String getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    public String getNoOfCrops() {
        return noOfCrops;
    }

    public void setNoOfCrops(String noOfCrops) {
        this.noOfCrops = noOfCrops;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ArrayList<Datum> getData() {
        return data;
    }

    public void setData(ArrayList<Datum> data) {
        this.data = data;
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
        parcel.writeString(stutus);
        parcel.writeString(totalCost);
        parcel.writeString(noOfCrops);
        parcel.writeString(region);
        parcel.writeTypedList(data);
    }
}
