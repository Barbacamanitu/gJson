package com.gjson;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.gjson.Deserializers.*;
import com.gjson.geoJSON.*;
import com.gjson.geoJSON.Geometry.*;
import com.google.gson.*;

/**
 *
 * @author russm
 */
public class GeoJSONParser {
    Gson gson;
    public GeoJSONParser(){
        GsonBuilder gsonB = new GsonBuilder();
        //RegisterDeserializers(gsonB);
        gsonB.registerTypeAdapter(GeoJSON.class, new GeoJSONDeserializer());
        gsonB.registerTypeAdapter(FeatureCollection.class, new FeatureCollectionDeserializer());
        gsonB.registerTypeAdapter(Feature.class, new FeatureDeserializer());
        gsonB.registerTypeAdapter(Geometry.class, new GeometryDeserializer());
        gsonB.registerTypeAdapter(GeometryCollection.class, new GeometryCollectionDeserializer());
        gsonB.registerTypeAdapter(LineString.class, new LineStringDeserializer());
        gsonB.registerTypeAdapter(MultiLineString.class, new MultiLineStringDeserializer());
        gsonB.registerTypeAdapter(MultiPoint.class, new MultiPointDeserializer());
        gsonB.registerTypeAdapter(MultiPolygon.class, new MultiPolygonDeserializer());
        gsonB.registerTypeAdapter(Point.class, new PointDeserializer());
        gsonB.registerTypeAdapter(Polygon.class, new PolygonDeserializer());
        gsonB.registerTypeAdapter(Position.class, new PositionDeserializer());
        gson = gsonB.create();
    }
    
    
    public GeoJSON parse(String str){
        return gson.fromJson(str, GeoJSON.class);
    }

}
