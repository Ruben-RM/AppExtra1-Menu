package com.example.appextra1_menu

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.collection.emptyLongSet
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var btn_1:AppCompatButton
    lateinit var btn_2:AppCompatButton
    lateinit var btn_3:AppCompatButton
    lateinit var btn_4:AppCompatButton
    lateinit var btn_5:AppCompatButton
    lateinit var tv_btn_5:TextView

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

    fun initComponents()
    {
        btn_1 = findViewById(R.id.btn_1)
        btn_2 = findViewById(R.id.btn_2)
        btn_3 = findViewById(R.id.btn_3)
        btn_4 = findViewById(R.id.btn_4)
        btn_5 = findViewById(R.id.btn_5)
        tv_btn_5 = findViewById(R.id.tv_btn_5)
    }

    fun initListeners()
    {
        btn_1.setOnClickListener()
        {

        }

        btn_2.setOnClickListener()
        {

        }

        btn_3.setOnClickListener()
        {

        }

        btn_4.setOnClickListener()
        {
            finishAffinity()
        }

        btn_5.setOnClickListener()
        {
            if (tv_btn_5.visibility == View.VISIBLE)
                tv_btn_5.visibility = View.INVISIBLE
            else
                tv_btn_5.visibility = View.VISIBLE
        }
    }
}