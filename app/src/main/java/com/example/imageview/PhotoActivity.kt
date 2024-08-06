package com.example.imageview

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class PhotoActivity : AppCompatActivity() {

    private val images = intArrayOf(
        R.drawable.photo1, R.drawable.photo2, R.drawable.photo3,
        R.drawable.photo4, R.drawable.photo5
    )
    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo)

        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.setImageResource(images[currentIndex])

        val buttonNextPhoto = findViewById<Button>(R.id.buttonNextPhoto)
        buttonNextPhoto.setOnClickListener {
            currentIndex++
            if (currentIndex < images.size) {
                imageView.setImageResource(images[currentIndex])
            } else {
                val intent = Intent(this, EndActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}
