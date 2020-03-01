package com.example.databinding_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding_project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var databinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        databinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }
}
