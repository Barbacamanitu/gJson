package com.gjson;




import com.google.gson.*;
import java.lang.reflect.Type;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author russm
 */
public class PointDeserializer implements JsonDeserializer<Point> {
    public Point deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
        Point p = new Point();
        JsonArray arr = json.getAsJsonObject().get("coordinates").getAsJsonArray();
        p.Latitude = arr.get(0).getAsFloat();
        p.Longitude = arr.get(1).getAsFloat();
        return p;
  }
}
