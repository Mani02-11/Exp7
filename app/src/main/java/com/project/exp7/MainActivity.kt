package com.project.exp7

import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var listView: ListView

    private val technologyNames = arrayOf(
        "Java",
        "Python",
        "Android",
        "Spring Boot",
        "MySQL"
    )

    private val technologyIcons = intArrayOf(
        android.R.drawable.ic_menu_manage,
        android.R.drawable.ic_menu_compass,
        android.R.drawable.ic_menu_view,
        android.R.drawable.ic_menu_upload,
        android.R.drawable.ic_menu_save
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)

        val adapter = TechnologyAdapter(
            this,
            technologyNames,
            technologyIcons
        )

        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->

            Toast.makeText(
                this,
                "Selected: ${technologyNames[position]}",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}