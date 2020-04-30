package com.example.petaspbu;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;

        LatLng petane = new LatLng(-7.995409, 112.619791);
        map.addMarker(new MarkerOptions().position(petane).title("SPBU SUKUN"));
        map.moveCamera(CameraUpdateFactory.newLatLng(petane));

        LatLng petane2 = new LatLng(-7.986214, 112.626655);
        map.addMarker(new MarkerOptions().position(petane2).title("SPBU KASIN"));
        map.moveCamera(CameraUpdateFactory.newLatLng(petane2));

        LatLng petane3 = new LatLng(-7.980598, 112.637440);
        map.addMarker(new MarkerOptions().position(petane3).title("SPBU TRUNOJOYO"));
        map.moveCamera(CameraUpdateFactory.newLatLng(petane3));

        LatLng petane4 = new LatLng(-7.983175, 112.614604);
        map.addMarker(new MarkerOptions().position(petane4).title("SPBU MERGAN"));
        map.moveCamera(CameraUpdateFactory.newLatLng(petane4));

        LatLng petane5 = new LatLng(-7.920783, 112.595091);
        map.addMarker(new MarkerOptions().position(petane5).title("SPBU UMM"));
        map.moveCamera(CameraUpdateFactory.newLatLng(petane5));
    }
}
