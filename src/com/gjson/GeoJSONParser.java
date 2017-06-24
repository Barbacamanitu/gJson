package com.gjson;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 * @author russm
 */
public class GeoJSONParser {
    Gson gson;
    public GeoJSONParser(){
        GsonBuilder gsonB = new GsonBuilder();
        gsonB.registerTypeAdapter(Point.class, new PointDeserializer());
        gson = gsonB.create();
    }
    
    public Polygon parsePolygon(String jsonData){
        return gson.fromJson(jsonData,Polygon.class);
    }
}
