package com.o7solutions.fragmentcontainerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.o7solutions.fragmentcontainerapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var a = 10
    lateinit var binding : ActivityMainBinding
    var activityClickInterface : ActivityClickInterface? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvChangeFragment.setOnClickListener {
            a++
            activityClickInterface?.ActivityClick(a)
        }
    }

    fun changeText(text : String){
        binding.tvName.setText(text)
    }
}