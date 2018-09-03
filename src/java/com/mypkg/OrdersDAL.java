/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mypkg;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author saumya agarwal
 */
public class OrdersDAL extends AppDAL {

    public List getOrdersbyUserID(int userid) {
         try {
            Class.forName(driverClass);
       
           Connection con=DriverManager.getConnection(connectionURL,dbuname,dbpass);
           Statement stat=con.createStatement();
           
           String query="SELECT * from "+schema+"TBL_ORDERS where USERID="+userid;
           ResultSet results = stat.executeQuery(query);
           
           List list=new ArrayList();
           
           while (results.next()) {
               OrdersBean bean=new OrdersBean();
                        bean.setOrderid(results.getInt("ORDERID"));
                        bean.setUserid(results.getInt("USERID"));
                        bean.setTotalbill(results.getFloat("TOTALBILL"));
                        bean.setOrderdate(results.getString("ORDERDATE"));
                        bean.setStatus(results.getString("STATUS"));
                        list.add(bean);      
                      }
  return list;
            

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MenuDAL.class.getName()).log(Level.SEVERE, null, ex);
            return  null;
        }
    }
    
}
