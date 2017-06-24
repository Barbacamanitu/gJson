package com.gjson;




import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Type;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author russm
 */
public class Polygon {
    @SerializedName("points")
    Point[] Points;
    
    public void print(){
        System.out.println("------Polygon------");
        for (Point p : Points){
            System.out.println("Lat: " + p.Latitude + ", Longitude: " + p.Latitude);
        }
        System.out.println("-------------------");

    }
}
/*
private class PolygonDeserializer implements JsonDeserializer<Polygon> {
  public Polygon deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
    return new DateTime(json.getAsJsonPrimitive().getAsString());
  }
}
*/