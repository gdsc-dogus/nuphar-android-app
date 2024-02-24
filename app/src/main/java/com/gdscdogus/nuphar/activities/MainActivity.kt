package com.gdscdogus.nuphar.activities

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.annotation.ColorInt
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.gdscdogus.nuphar.R
import com.gdscdogus.nuphar.databinding.ActivityMainBinding
import com.gdscdogus.nuphar.fragments.ContactFragment
import com.gdscdogus.nuphar.fragments.HomeFragment
import com.gdscdogus.nuphar.fragments.MapFragment
import com.gdscdogus.nuphar.fragments.ProfileFragment

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var binding: ActivityMainBinding

    lateinit var homeFragment: HomeFragment
    lateinit var mapFragment: MapFragment
    lateinit var profileFragment: ProfileFragment
    lateinit var contactFragment: ContactFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        homeFragment = HomeFragment();
        changeFragment(homeFragment);
        mapFragment = MapFragment();
        profileFragment = ProfileFragment();
        contactFragment = ContactFragment();

        binding.ivHome.setOnClickListener(this)
        binding.ivMap.setOnClickListener(this)
        binding.ivContact.setOnClickListener(this)
        binding.ivProfile.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v == null)
            return

        if (v !is ImageView)
            return

        @ColorInt
        val green4 = getColor(R.color.green_4)

        @ColorInt
        val green5 = getColor(R.color.green_5)

        binding.ivHome.setColorFilter(green4)
        binding.ivMap.setColorFilter(green4)
        binding.ivContact.setColorFilter(green4)
        binding.ivProfile.setColorFilter(green4)

        v.setColorFilter(green5)

        when (v.id) {
            binding.ivHome.id -> {
                changeFragment(homeFragment);
            }

            binding.ivMap.id -> {
                changeFragment(mapFragment);
            }

            binding.ivProfile.id -> {
                changeFragment(profileFragment);
            }

            binding.ivContact.id -> {
                changeFragment(contactFragment);
            }
        }
    }

    private fun changeFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction();
        transaction.replace(binding.flFragment.id, fragment);
        transaction.commit();
    }
}