package com.example.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import androidx.appcompat.widget.AppCompatButton
import com.example.application.databinding.LayoutBinding
import com.google.android.material.textview.MaterialTextView

class MainActivity : AppCompatActivity() {

    private var _binding: LayoutBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = LayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){

        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}