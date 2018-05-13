package xyz.moroku0519.ongegaigirl

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.util.Log
import xyz.moroku0519.ongegaigirl.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main).apply {
            setupBottomNavigation(bottomNavigation)
        }
    }

    private fun setupBottomNavigation(bottomNavigationView: BottomNavigationView) {
        bottomNavigationView.setOnNavigationItemSelectedListener({ it ->
            when (it.itemId) {
                R.id.home -> {
                    Log.d("home", "home, selected")
                }
                R.id.list -> {
                    Log.d("list", "clicked")
                }
                R.id.girl -> {
                    Log.d("girl", "clicked")
                }
            }
            true
        })
    }
}

