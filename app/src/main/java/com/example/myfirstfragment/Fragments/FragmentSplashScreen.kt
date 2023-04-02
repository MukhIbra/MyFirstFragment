package com.example.myfirstfragment.Fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myfirstfragment.R

@SuppressLint("CustomSplashScreen")
class FragmentSplashScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view = inflater.inflate(R.layout.fragment_splash_screen, container, false)

        Handler(Looper.myLooper()!!).postDelayed({
            parentFragmentManager.beginTransaction()
                .replace(R.id.main, FragmentLogin())
                .commit()
        },3000)
        return view
    }

}