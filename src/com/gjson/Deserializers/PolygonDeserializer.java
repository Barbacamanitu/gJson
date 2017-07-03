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
import java.util.ArrayList;

/**
 *
 * @author russm
 */
public class PolygonDeserializer implements JsonDeserializer<Polygon> {
    @Override
     public Polygon deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
      Polygon geo = new Polygon();
      JsonArray coordArray = Utility.getCoordinateArray(json);
      for (JsonElement ring : coordArray){
          JsonArray coords = ring.getAsJsonArray();
          ArrayList<Position> posList = new ArrayList<>();
          for (JsonElement coord: coords){
              posList.add(context.deserialize(coord,Position.class));
          }
          geo.Coordinates.add(posList);
      }
      return geo;
  }
}