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
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

/**
 *
 * @author russm
 */
public class MultiPolygonDeserializer implements JsonDeserializer<MultiPolygon> {
    @Override
     public MultiPolygon deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
      MultiPolygon geo = new MultiPolygon();
      JsonArray arr = json.getAsJsonObject().get("coordinates").getAsJsonArray();
      for (JsonElement el : arr){
          geo.Polygons.add(context.deserialize(el,Polygon.class));
      }
      return geo;
  }
}