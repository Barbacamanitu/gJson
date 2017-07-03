/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gjson.geoJSON;

import java.util.ArrayList;

/**
 *
 * @author russm
 */
public class FeatureCollection extends GeoJSON {
    public ArrayList<Feature> Features;
    public FeatureCollection(){
        Features = new ArrayList<>();
    }
}
