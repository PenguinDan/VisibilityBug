package com.example.visiblitybugapp

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.visiblitybugapp.databinding.SecondBinding
import kotlinx.android.synthetic.main.second.*

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

    override fun onStop() {
        Log.d("SecondActivity", "Is Visible Before onStop: ${progressBar.visibility == View.VISIBLE}")
        super.onStop()
        Log.d("SecondActivity", "Is Visible After onStop: ${progressBar.visibility == View.VISIBLE}")
    }
}