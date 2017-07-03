package com.gjson.Deserializers;

import com.gjson.geoJSON.Feature;
import com.gjson.geoJSON.Geometry.Geometry;
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
public class FeatureDeserializer implements JsonDeserializer<Feature>{
    
    
  public Feature deserialize(final JsonElement json, final Type typeOfT, final JsonDeserializationContext context)
      throws JsonParseException {
      Feature feature = new Feature();
      
      feature.geometry = context.deserialize(json.getAsJsonObject().get("geometry"), Geometry.class);
      
      return feature;
  }
}

