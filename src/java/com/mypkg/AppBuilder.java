/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mypkg;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author saumya agarwal
 */
public class AppBuilder {

   public String objTojson(List inputlist)  {
       try {
           
           ObjectMapper mapper = new ObjectMapper();
           String jsonInString=mapper.writeValueAsString(inputlist);
           return jsonInString;
       } catch (JsonProcessingException ex) {
           Logger.getLogger(AppBuilder.class.getName()).log(Level.SEVERE, null, ex);
            return null;
       }
    }
    
   
//    public <T> jsonToObj(String inputjson) throws IOException 
//    {
//     ObjectMapper mapper = new ObjectMapper();   
//    T t = mapper.readValue(inputjson,T.class);
//    return t;
//    }
   
}
