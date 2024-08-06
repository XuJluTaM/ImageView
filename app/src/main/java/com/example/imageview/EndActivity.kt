package com.example.imageview

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class EndActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end)

        val buttonFinish = findViewById<Button>(R.id.buttonFinish)
        buttonFinish.setOnClickListener {
            finishAffinity()
        }
    }
}
