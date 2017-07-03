/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gjson.Deserializers;

import com.gjson.geoJSON.Geometry.*;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

/**
 *
 * @author russm
 */
public class PointDeserializer implements JsonDeserializer<Point> {
    @Override
     public Point deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
      Point geo = new Point();
      geo.Coordinates = context.deserialize(json.getAsJsonObject().get("coordinates"), Position.class);
      return geo;
  }
}