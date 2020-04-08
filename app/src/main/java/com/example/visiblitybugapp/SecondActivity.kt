package com.example.visiblitybugapp

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.visiblitybugapp.databinding.SecondBinding

class SecondActivity : AppCompatActivity() {
    private val secondVM by viewModels<SecondVM> {
        ViewModelProvider.AndroidViewModelFactory(application)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<SecondBinding>(
            this, R.layout.second
        ).apply {
            viewModel = secondVM
        }
    }
}