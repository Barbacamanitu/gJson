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
public class GeometryCollectionDeserializer implements JsonDeserializer<GeometryCollection> {
    @Override
     public GeometryCollection deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
      GeometryCollection geo = new GeometryCollection();
      JsonArray arr = json.getAsJsonObject().get("geometries").getAsJsonArray();
      for (JsonElement el: arr){
          geo.Geometries.add(context.deserialize(el,Geometry.class));
      }
      return geo;
  }
}