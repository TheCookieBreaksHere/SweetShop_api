/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mypkg;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


/**
 *
 * @author saumya agarwal
 */
@Path("orders")
public class OrdersEndpoint {
    
    OrdersService service=new OrdersService();
    
 @GET
@Path("/{userid}")
@Produces("application/json")
public Response getOrdersbyUserID(@PathParam("userid") int userid) {
      String responsedata=service.getOrdersbyUserID(userid);
        return Response.ok(responsedata).build();
}         

    
}
