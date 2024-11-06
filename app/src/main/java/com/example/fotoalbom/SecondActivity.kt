package com.example.fotoalbom

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var buttonBTN: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        imageView = findViewById(R.id.imageViewIV)
        buttonBTN = findViewById(R.id.buttonBTN)

        val listImage = listOf(
            R.drawable._17e631827041c710d6478f628678de0,
            R.drawable._222f329c41a034b9cb726074bed42a7,
            R.drawable._3e29b1872d4ac2819efed3fd1118599,
            R.drawable._7d73630556e079fcfc1931da0f17ab7,
            R.drawable._b33ad2ea2f87aa229e36e34c8d6e9f6,
            R.drawable._feb3557b1500aa3dd8bf49355ff4e15
        )

        imageView.setImageResource(listImage[0])

        var count = 1
        buttonBTN.setOnClickListener {
            if (count >=6) {
                val intent = Intent(this, ThirdActivity::class.java)
                startActivity(intent)
            } else {
                imageView.setImageResource(listImage[count])
                count++
            }
        }
    }
}