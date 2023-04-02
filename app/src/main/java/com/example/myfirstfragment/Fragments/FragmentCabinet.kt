package com.example.myfirstfragment.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Toast
import com.example.myfirstfragment.R
import com.example.myfirstfragment.databinding.FragmentCabinetBinding
import nl.joery.animatedbottombar.AnimatedBottomBar

class FragmentCabinet : Fragment() {
    private lateinit var binding: FragmentCabinetBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCabinetBinding.inflate(inflater, container, false)
        replaceFragment(FragmentHome())
        binding.bottomBar.setOnTabSelectListener(object : AnimatedBottomBar.OnTabSelectListener {
            override fun onTabSelected(
                lastIndex: Int,
                lastTab: AnimatedBottomBar.Tab?,
                newIndex: Int,
                newTab: AnimatedBottomBar.Tab
            ) {
                Toast.makeText(activity, "$newIndex", Toast.LENGTH_SHORT).show()

                when (newIndex) {
                    0 -> replaceFragment(FragmentHome())
                    1 -> replaceFragment(FragmentShopping())
                    2 -> replaceFragment(FragmentSettings())
                }
            }

        })

        return binding.root
    }

    private fun replaceFragment(fragment: Fragment) {
        parentFragmentManager.beginTransaction()
            .replace(R.id.fragments, fragment).commit()
    }
}