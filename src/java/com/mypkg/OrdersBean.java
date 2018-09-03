/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mypkg;

/**
 *
 * @author saumya agarwal
 */
public class OrdersBean {
    
    private int orderid;
    private int userid;
    private String billcontact;
    private float totalbill;
    private String orderdate;

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getBillcontact() {
        return billcontact;
    }

    public void setBillcontact(String billcontact) {
        this.billcontact = billcontact;
    }

    public float getTotalbill() {
        return totalbill;
    }

    public void setTotalbill(float totalbill) {
        this.totalbill = totalbill;
    }

    public String getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    private String status;
    
}
