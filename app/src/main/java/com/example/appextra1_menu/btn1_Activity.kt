package com.example.appextra1_menu

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class btn1_Activity : AppCompatActivity() {

    lateinit var btn_1_back2Main:AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_btn1)

        initComponents()
        initListeners()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun initComponents()
    {
        btn_1_back2Main = findViewById(R.id.btn_1_back2Main)
    }

    private fun initListeners()
    {
        btn_1_back2Main.setOnClickListener()
        {
            nav2Main()
        }
    }

    private fun nav2Main()
    {
        val intentMA = Intent(this, MainActivity::class.java)

        startActivity(intentMA)
    }
}