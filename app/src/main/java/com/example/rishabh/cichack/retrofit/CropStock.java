
package com.example.rishabh.cichack.retrofit;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CropStock implements Serializable
{

    private String stutus;
    private String totalCost;
    private String noOfCrops;
    private String region;
    private List<Datum> data = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8902645174905269085L;

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

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
