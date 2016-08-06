package com.example.teja3.zbar;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;


public class locate extends Activity {





    protected LocationManager locationManager;
    protected LocationListener locationListener;
    protected Context context;
    TextView txtLat;
    String lat;
    String provider;
    protected String latitude,longitude;
    protected boolean gps_enabled,network_enabled;
    Location loc;





        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            //setContentView(R.layout.activity_main);
            //txtLat = (TextView) findViewById(R.id.textview1);
            Toast.makeText(getApplicationContext(), "this is my locate Toast 22", Toast.LENGTH_SHORT).show();
/*
            locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 10, 0, this);
            loc = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
            txtLat = (TextView) findViewById(R.id.textview1);
            txtLat.setText("Latitude:" + loc.getLatitude() + ", Longitude:" + loc.getLongitude());
            Toast.makeText(getApplicationContext(), "this is my Toast 22", Toast.LENGTH_SHORT).show();
        }*/
        /*@Override
        public void onLocationChanged(Location location) {
            //txtLat = (TextView) findViewById(R.id.textview1);
            Toast.makeText(getApplicationContext(), "this is my Toast 22", Toast.LENGTH_SHORT).show();
            txtLat.setText("Latitude:" + location.getLatitude() + ", Longitude:" + location.getLongitude());
            Toast.makeText(getApplicationContext(), "this is my Toast 22", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onProviderDisabled(String provider) {
            Log.d("Latitude","disable");
        }
      @Override
        public void onProviderEnabled(String provider) {
            Log.d("Latitude","enable");
        }

       @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {
            Log.d("Latitude","status");
        }*/




}}
