package com.example.zt.collweatherapplication.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/3/17 0017.
 */

public class province extends DataSupport {


    private   int id;

    private  String provinceName;

    private  int provinceCode;

    public   void setId(int id)
    {
        this.id=id;
    }
    public  int getId()
    {
        return id;
    }
    public   void setprovinceName(String provinceName)
    {
        this.provinceName=provinceName;
    }
    public  String getprovinceName()
    {
        return provinceName;
    }


    public   void setprovinceCode(int provinceCode)
    {
        this.provinceCode=provinceCode;
    }
    public  int getprovinceCode()
    {
        return provinceCode;
    }
}
