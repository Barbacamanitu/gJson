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
public class PositionDeserializer implements JsonDeserializer<Position> {
    @Override
     public Position deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
      Position pos = new Position();
      if (!json.isJsonArray() || json.getAsJsonArray().size() < 2){
          throw new JsonParseException("Position malformed.");
      }
      
      JsonArray arr = json.getAsJsonArray();
      pos.Longitude = arr.get(0).getAsFloat();
      pos.Latitude = arr.get(1).getAsFloat();
      if (arr.size() > 2){
          pos.Elevation = arr.get(2).getAsFloat();
      }     
      return pos;
  }
}