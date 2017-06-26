package com.example.arimyang.myapplication;

import com.skp.Tmap.TMapPOIItem;

public class POI {
        TMapPOIItem item;

        public POI(TMapPOIItem item){
            this.item = item;
        }

        @Override
        public String toString() {
            return item.getPOIName();
        }
}
