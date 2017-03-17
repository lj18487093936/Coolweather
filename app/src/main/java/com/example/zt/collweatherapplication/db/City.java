package com.example.zt.collweatherapplication.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/3/17 0017.
 */

public class City extends DataSupport {

    private   int provinceID;
    private   int id;
    private  String cityName;

    private  int cityCode;

    public   void setid(int id)
    {
        this.id=id;
    }
    public  int getid()
    {
        return id;
    }
    public   void setprovinceID(int provinceID)
    {
        this.provinceID=provinceID;
    }
    public  int getprovinceID()
    {
        return provinceID;
    }
    public   void setcityName(String cityName)
    {
        this.cityName=cityName;
    }
    public  String getcityName()
    {
        return cityName;
    }


    public   void setcityCode(int cityCode)
    {
        this.cityCode=cityCode;
    }
    public  int getcityCode()
    {
        return cityCode;
    }
}
