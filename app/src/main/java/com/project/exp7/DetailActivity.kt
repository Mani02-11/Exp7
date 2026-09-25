package com.project.exp7

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val name = intent.getStringExtra("EXTRA_NAME") ?: "Unknown"
        val iconRes = intent.getIntExtra("EXTRA_ICON", android.R.drawable.ic_menu_help)

        val imageView: ImageView = findViewById(R.id.detailImageView)
        val textView: TextView = findViewById(R.id.detailTextView)

        imageView.setImageResource(iconRes)
        textView.text = name
    }
}