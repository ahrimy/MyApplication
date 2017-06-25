package com.example.arimyang.myapplication;


import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.skp.Tmap.TMapMarkerItem;
import com.skp.Tmap.TMapPoint;
import com.skp.Tmap.TMapView;
import com.skp.Tmap.TMapGpsManager;

import java.util.ArrayList;

import static com.skp.Tmap.MapUtils.mApiKey;

public class MainActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Relative Layout relativeLayout = new RelativeLayout(this);
        TMapView tmapview = new TMapView(this);//tmapview생성
        tmapview.setSKPMapApiKey("cbe6c66f-2b57-3ee7-a174-ed80856248ae");//등록도니 키 설정정
       tmapview.setLanguage(TMapView.LANGUAGE_KOREAN);//언어선택
        tmapview.setIconVisibility(true);
        tmapview.setZoomLevel(10);//지도축척레벨설정
        tmapview.setMapType(TMapView.MAPTYPE_STANDARD);
        tmapview.setCompassMode(true);
        tmapview.setTrackingMode(true);
        relativeLayout.addView(tmapview);
        setContentView(relativeLayout)
    }

}
