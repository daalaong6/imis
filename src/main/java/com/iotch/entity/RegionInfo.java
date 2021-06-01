package com.iotch.entity;

public class RegionInfo {
    private String regionCode;
    private String regionName;

    public RegionInfo() {
    }

    public RegionInfo(String regionCode, String regionName) {
        this.regionCode = regionCode;
        this.regionName = regionName;
    }

    @Override
    public String toString() {
        return "RegionInfo{" +
                "regionCode='" + regionCode + '\'' +
                ", regionName='" + regionName + '\'' +
                '}';
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }
}
