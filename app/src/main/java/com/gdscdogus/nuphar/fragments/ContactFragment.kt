package com.gdscdogus.nuphar.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.gdscdogus.nuphar.databinding.FragmentContactBinding

class ContactFragment : Fragment() {
    lateinit var binding: FragmentContactBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentContactBinding.inflate(inflater)

        binding.btnSend.setOnClickListener {
            binding.etMessage.text.clear()
            Toast.makeText(context, "Message sent.", Toast.LENGTH_SHORT).show()
        }

        return binding.root
    }
}