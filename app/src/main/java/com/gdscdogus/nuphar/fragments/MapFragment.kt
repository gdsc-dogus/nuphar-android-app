package com.gdscdogus.nuphar.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.gdscdogus.nuphar.databinding.FragmentHomeBinding
import com.gdscdogus.nuphar.databinding.FragmentMapBinding

class MapFragment : Fragment() {
    lateinit var binding: FragmentMapBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMapBinding.inflate(inflater)

        return binding.root
    }
}