package com.example.databinding_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding_project.databinding.ActivityMainBinding
import com.example.databinding_project.livedata.LiveDataActivity
import com.example.databinding_project.viewmodel.ObservableFieldsActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
            .also { binding ->
                binding.btnObservableFieldsButton.setOnClickListener {
                    startActivity(Intent(this, ObservableFieldsActivity::class.java))
                }
                binding.btnLiveData.setOnClickListener {
                    startActivity(Intent(this, LiveDataActivity::class.java))
                }
            }
    }
}
