/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gjson.Deserializers;

import com.gjson.geoJSON.*;
import com.gjson.geoJSON.Geometry.*;
import com.google.gson.*;
import java.lang.reflect.Type;

/**
 *
 * @author russm
 */
public class GeoJSONDeserializer implements JsonDeserializer<GeoJSON> {
  @Override
  public GeoJSON deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
      GeoJSON geo = new GeoJSON();
      JsonObject obj = json.getAsJsonObject();
      String strType = obj.get("type").getAsString().toLowerCase();
      switch(strType){
          case "feature":
            return context.deserialize(json, Feature.class);
          case "featurecollection":
            return context.deserialize(json, FeatureCollection.class);
          case "geometrycollection":
              return context.deserialize(json,GeometryCollection.class);
          case "linestring":
              return context.deserialize(json,LineString.class);
          case "multilinestring":
              return context.deserialize(json,MultiLineString.class);
          case "multipoint":
              return context.deserialize(json,MultiPoint.class);
          case "multipolygon":
              return context.deserialize(json,MultiPolygon.class);
          case "point":
              return context.deserialize(json,Point.class);
          case "polygon":
              return context.deserialize(json,Polygon.class);
          default:
              return geo;
      }
    //return new DateTime(json.getAsJsonPrimitive().getAsString());
  }
}