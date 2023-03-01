package com.example.drink_express_mallorca

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.drink_express_mallorca.databinding.LogInScreenBinding

class login_screen : Fragment() {
    private lateinit var binding: LogInScreenBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = LogInScreenBinding.inflate(
            inflater
        )
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        }
    }

