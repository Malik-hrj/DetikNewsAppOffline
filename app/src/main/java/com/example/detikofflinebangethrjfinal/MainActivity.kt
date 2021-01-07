package com.example.detikofflinebangethrjfinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.detikofflinebangethrjfinal.fragment.Kategori
import com.example.detikofflinebangethrjfinal.fragment.HomeFragment
import com.example.detikofflinebangethrjfinal.fragment.LayananFragment
import com.example.detikofflinebangethrjfinal.fragment.VideoFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonnavigation.setOnNavigationItemSelectedListener(onBottonNavListener)
        val fragmentkk = supportFragmentManager.beginTransaction()
        fragmentkk.add(R.id.frame_kk, HomeFragment())
        fragmentkk.commit()
    }

    private val onBottonNavListener = BottomNavigationView.OnNavigationItemSelectedListener { i ->  var selectedFragment: Fragment = HomeFragment()
        when (i.itemId) {
            R.id.itemHome -> {
                selectedFragment = HomeFragment()
            }
            R.id.itemkategori -> {
                selectedFragment = KategoriFragment()

            }

            R.id.itemLayanan -> {
                selectedFragment = LayananFragment()
            }
            R.id.itemVideos -> {
                selectedFragment = VideoFragment()
            }


        }
        val fragmentkk = supportFragmentManager.beginTransaction()
        fragmentkk.replace(R.id.frame_kk, selectedFragment)
        fragmentkk.commit()

        true
    }
    fun changeFragment(fragment:Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, fragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            .commit()

    }

    fun finishMe(){
        finish()
    }
}