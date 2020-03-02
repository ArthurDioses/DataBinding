package com.example.databinding_project.livedata

import android.os.Bundle
import android.util.Patterns
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.example.databinding_project.R
import com.example.databinding_project.databinding.ActivityLiveDataBinding
import com.example.databinding_project.viewmodel.LoginFormViewModel

class LiveDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivityLiveDataBinding>(this, R.layout.activity_live_data)
            .also { binding ->
                binding.lifecycleOwner = this
                binding.viewModel = LoginFormViewModel().also { viewModel ->
                    val observer = Observer<Any> {
                        viewModel.updateLoginEnabledState(
                            Patterns.EMAIL_ADDRESS.matcher(viewModel.emailData.value).matches()
                                    && !viewModel.passwordData.value.isNullOrBlank()
                        )
                    }
                    viewModel.emailData.observe(this, observer)
                    viewModel.passwordData.observe(this, observer)
                }
            }
    }
}