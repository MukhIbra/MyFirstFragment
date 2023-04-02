package com.example.myfirstfragment.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.myfirstfragment.R
import com.example.myfirstfragment.databinding.FragmentLoginBinding

class FragmentLogin : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.btn.setOnClickListener {
            if (binding.login.text.toString() == "admin" && binding.password.text.toString() == "123") {
                parentFragmentManager.beginTransaction()
                    .replace(R.id.main, FragmentCabinet())
                    .commit()

            } else {
                Toast.makeText(activity, "Invalid login or password", Toast.LENGTH_SHORT).show()
            }
        }


        return binding.root
    }

}