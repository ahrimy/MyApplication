package com.example.arimyang.myapplication;


import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.skp.Tmap.TMapMarkerItem;
import com.skp.Tmap.TMapPoint;
import com.skp.Tmap.TMapView;

public class MainActivity extends Activity {

    private final String TMAP_API_KEY = "cbe6c66f-2b57-3ee7-a174-ed80856248ae";
    private TMapView tmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initTmap();
    }

    private void initTmap() {
        tmap = new TMapView(this);
        tmap.setSKPMapApiKey(TMAP_API_KEY);
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.main_layout_tmap);

        double lat = 37.5025595;
        double lng = 126.8423617;
        tmap.setCenterPoint(lng, lat);
        tmap.setZoomLevel(15);

        layout.addView(tmap);

        addMarker();
    }
    private void addMarker() {
        double lat = 37.5025595;
        double lng = 126.8423617;

        TMapPoint point = new TMapPoint(lat,lng);
        TMapMarkerItem marker = new TMapMarkerItem();
        marker.setTMapPoint(point);
        tmap.addMarkerItem("marker",marker);
    }
}
