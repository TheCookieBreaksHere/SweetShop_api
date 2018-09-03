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
public class MenuService {

    MenuBuilder builder=new MenuBuilder();
    MenuDAL dal=new MenuDAL();
    
    public String getMenu() {
        
        String menu= builder.objTojson(dal.getMenu());
        return menu;
    }
    
}
