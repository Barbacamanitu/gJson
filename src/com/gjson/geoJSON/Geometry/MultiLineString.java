/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gjson.geoJSON.Geometry;

import java.util.ArrayList;

/**
 *
 * @author russm
 */
public class MultiLineString extends Geometry {
    public ArrayList<LineString> LineStrings;

    public MultiLineString() {
        LineStrings = new ArrayList<>();
    }
}
