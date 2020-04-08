package com.example.visiblitybugapp

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.activityMainButton).setOnClickListener {
            startActivity(
                Intent(this, SecondActivity::class.java),
                // Comment this line out and the error will not persist
                ActivityOptions.makeSceneTransitionAnimation(this).toBundle()
            )
        }
    }
}
