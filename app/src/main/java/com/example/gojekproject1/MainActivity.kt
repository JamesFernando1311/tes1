package com.example.gojekproject1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      LookUpActivity.setOnClickListener{
        openLookUpActivity()
        }

    }
     fun openLookUpActivity() {
        val intent = Intent(this, LookUpMain::class.java).apply {
            putExtra("Extras", "This data from main Activity")
        }
        startActivity(intent)
    }
}