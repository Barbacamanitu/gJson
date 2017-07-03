/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gjson.Deserializers;

import com.gjson.geoJSON.Geometry.*;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

/**
 *
 * @author russm
 */
public class LineStringDeserializer implements JsonDeserializer<LineString> {
    @Override
     public LineString deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
      LineString geo = new LineString();
      
      JsonArray arr = Utility.getCoordinateArray(json);
      
      for (JsonElement el : arr){
          geo.Coordinates.add(context.deserialize(el,Position.class));
      }
      return geo;
  }
}
