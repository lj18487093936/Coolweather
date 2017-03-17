package com.example.zt.collweatherapplication.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/3/17 0017.
 */

public class County extends DataSupport {

    private int id;
    private String countyName;
    private String weatherID;
    private int cityID;

    public void setweatherID(String weatherID) {
        this.weatherID = weatherID;
    }

    public String getweatherID() {
        return weatherID;
    }

    public void setcityID(int cityID) {
        this.cityID = cityID;
    }

    public int getcityID() {
        return cityID;
    }

    public void setid(int id) {
        this.id = id;
    }

    public int getid() {
        return id;
    }

    public void setcountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getcountyName() {
        return countyName;
    }
}
