package com.example.roughwork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    var tabLayout: TabLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout = findViewById<TabLayout>(R.id.tabLayout2)

        tabLayout!!.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
               when(tab.position){
                   0->Navigation.findNavController(this@MainActivity,R.id.hostFragment).navigate(R.id.mensClothsFragment)
                   1->Navigation.findNavController(this@MainActivity,R.id.hostFragment).navigate(R.id.mensDesignsFragment)
               }
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {

            }
            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })
    }
}
