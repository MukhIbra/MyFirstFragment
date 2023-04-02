package com.example.myfirstfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.window.SplashScreen
import com.example.myfirstfragment.Fragments.FragmentSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.main, FragmentSplashScreen())
            .commit()
    }
}