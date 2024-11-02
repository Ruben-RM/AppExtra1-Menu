package com.example.appextra1_menu

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var btn1:AppCompatButton
    private lateinit var btn2:AppCompatButton
    private lateinit var btn3:AppCompatButton
    private lateinit var btn4:AppCompatButton
    private lateinit var btn5:AppCompatButton
    private lateinit var tvBtn5:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

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
        btn1 = findViewById(R.id.btn_1)
        btn2 = findViewById(R.id.btn_2)
        btn3 = findViewById(R.id.btn_3)
        btn4 = findViewById(R.id.btn_4)
        btn5 = findViewById(R.id.btn_5)
        tvBtn5 = findViewById(R.id.tv_btn_5)
    }

    private fun initListeners()
    {
        btn1.setOnClickListener()
        {
            nav2Act2()
        }

        btn2.setOnClickListener()
        {
            Toast.makeText(this, "¡Pulsaste el segundo botón!", Toast.LENGTH_LONG).show()
        }

        btn3.setOnClickListener()
        {
            Snackbar.make(btn3, "¡Pulsaste el tercer botón!", Snackbar.LENGTH_SHORT)
                .setAnchorView(btn3)
                .show()
        }

        btn4.setOnClickListener()
        {
            finishAffinity()
        }

        btn5.setOnClickListener()
        {
            if (tvBtn5.visibility == View.VISIBLE)
                tvBtn5.visibility = View.INVISIBLE
            else
                tvBtn5.visibility = View.VISIBLE
        }
    }

    private fun nav2Act2()
    {
        val intentA2 = Intent(this, btn1_Activity::class.java)

        startActivity(intentA2)
    }
}