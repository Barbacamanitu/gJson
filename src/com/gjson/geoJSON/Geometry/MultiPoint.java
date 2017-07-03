/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gjson.geoJSON.Geometry;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

/**
 *
 * @author russm
 */
public class MultiPoint extends Geometry {
    public ArrayList<Position> Coordinates;
    
    public MultiPoint(){
        Coordinates = new ArrayList<>();
    }
}
