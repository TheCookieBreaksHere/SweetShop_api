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



public class OrdersService {
OrdersDAL dal=new OrdersDAL();
OrdersBuilder builder=new OrdersBuilder();

    String getOrdersbyUserID(int userid) {
        String orders=builder.objTojson(dal.getOrdersbyUserID(userid));

        return orders;
    }
    
}
