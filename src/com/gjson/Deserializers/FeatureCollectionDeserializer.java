/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gjson.Deserializers;

import com.gjson.geoJSON.Feature;
import com.gjson.geoJSON.FeatureCollection;
import com.gjson.geoJSON.GeoJSON;
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
public class FeatureCollectionDeserializer implements JsonDeserializer<FeatureCollection> {
    @Override
     public FeatureCollection deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
      FeatureCollection coll = new FeatureCollection();
      JsonArray features = json.getAsJsonObject().get("features").getAsJsonArray();
      for (JsonElement el : features){
          coll.Features.add(context.deserialize(el,Feature.class));
      }
      return coll;
  }
}
