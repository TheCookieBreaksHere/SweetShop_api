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
public class MenuDAL extends AppDAL {
    
    
    
    public List getMenu() 
    {
        
        try {
            Class.forName(driverClass);
       
           Connection con=DriverManager.getConnection(connectionURL,dbuname,dbpass);
           Statement stat=con.createStatement();
           
           String query="SELECT * from "+schema+"TBL_MENU";
           ResultSet results = stat.executeQuery(query);
           
           List list=new ArrayList();
           
           while (results.next()) {
               MenuBean bean=new MenuBean();
                        bean.setItemid(results.getInt("ITEMID"));
                        bean.setItemname(results.getString("ITEMNAME"));
                        bean.setItemprice(results.getFloat("ITEMPRICE"));
                        bean.setItemqty(results.getInt("ITEMQTY"));
                        list.add(bean);      
                      }
            return list;

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MenuDAL.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
         
    }
    
}
