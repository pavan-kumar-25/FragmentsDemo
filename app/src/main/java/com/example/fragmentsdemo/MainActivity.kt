package com.example.fragmentsdemo

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private val fragmentManager = supportFragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        findViewById<Button>(R.id.btn1).setOnClickListener{
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.add(R.id.frame1, Blank1())
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }

        findViewById<Button>(R.id.btn2).setOnClickListener{
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.add(R.id.frame2, Blank2())
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }

        findViewById<Button>(R.id.btn3).setOnClickListener{
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.add(R.id.frame3, Blank3())
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }

        findViewById<Button>(R.id.btn4).setOnClickListener{
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.add(R.id.frame4, Blank4())
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }
    }
}