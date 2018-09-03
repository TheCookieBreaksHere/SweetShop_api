/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mypkg;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("menu")
public class MenuEndpoint {
    
  MenuService service =new MenuService();
    
   @GET    
  @Produces("application/json")
         public Response getMenu() 
    {
       String responsedata=service.getMenu();
        return Response.status(200).entity(responsedata).build();
    } 

 
     
}
