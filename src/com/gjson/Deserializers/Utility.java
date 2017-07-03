/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gjson.Deserializers;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

/**
 *
 * @author russm
 */
public class Utility {
    public static JsonArray getCoordinateArray(JsonElement json){
        JsonArray arr;
      
      if (json.isJsonObject()){
          arr = json.getAsJsonObject().get("coordinates").getAsJsonArray();
      }
      else
      {
          arr = json.getAsJsonArray();
      }
      return arr;
    }
}
