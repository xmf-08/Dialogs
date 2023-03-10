package com.example.dialogs.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.dialogs.R
import com.example.dialogs.databinding.ActivityMainBinding
import com.example.dialogs.databinding.FragmentDialogBinding

class FragmentDialog : DialogFragment() {
    lateinit var binding:FragmentDialogBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDialogBinding.inflate(layoutInflater)

        return binding.root
    }
}