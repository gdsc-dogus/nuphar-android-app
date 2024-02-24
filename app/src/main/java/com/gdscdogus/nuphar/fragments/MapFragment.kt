package com.gdscdogus.nuphar.fragments

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BlendMode
import android.graphics.BlendModeColorFilter
import android.graphics.Canvas
import android.graphics.PorterDuff
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.gdscdogus.nuphar.R
import com.gdscdogus.nuphar.databinding.FragmentMapBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.MarkerOptions


class MapFragment : Fragment(), OnMapReadyCallback {
    lateinit var binding: FragmentMapBinding
    lateinit var map: GoogleMap

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMapBinding.inflate(inflater)

        binding.mapView.onCreate(savedInstanceState);
        binding.mapView.getMapAsync(this);

        return binding.root
    }

    override fun onMapReady(p0: GoogleMap) {
        map = p0;
        map.uiSettings.isMyLocationButtonEnabled = false

        val dogusUniversity = com.google.android.gms.maps.model.LatLng(
            41.0015935038339,
            29.176088384635502
        )

        val cameraUpdate = CameraUpdateFactory.newLatLngZoom(
            dogusUniversity, 18F
        )
        map.animateCamera(cameraUpdate)

        val markerOptions = MarkerOptions();
        markerOptions.position(dogusUniversity);
        markerOptions.title("DOGUS University")
        markerOptions.icon(
            BitmapFromVector(
                requireContext(),
                R.drawable.ic_location_24dp
            )
        );
        map.addMarker(markerOptions);
    }

    private fun BitmapFromVector(context: Context, vectorResId: Int): BitmapDescriptor {
        val vectorDrawable = ContextCompat.getDrawable(
            context, vectorResId
        )
        vectorDrawable!!.setBounds(
            0, 0, vectorDrawable.intrinsicWidth,
            vectorDrawable.intrinsicHeight
        )
        vectorDrawable.colorFilter = BlendModeColorFilter(context.getColor(R.color.green_4), BlendMode.SRC_ATOP)
        val bitmap = Bitmap.createBitmap(
            vectorDrawable.intrinsicWidth,
            vectorDrawable.intrinsicHeight,
            Bitmap.Config.ARGB_8888
        )
        val canvas = Canvas(bitmap)

        vectorDrawable.draw(canvas)
        return BitmapDescriptorFactory.fromBitmap(bitmap)
    }

    override fun onResume() {
        super.onResume()
        binding.mapView.onResume()
    }

    override fun onPause() {
        super.onPause()
        binding.mapView.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
        binding.mapView.onDestroy()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        binding.mapView.onLowMemory()
    }
}