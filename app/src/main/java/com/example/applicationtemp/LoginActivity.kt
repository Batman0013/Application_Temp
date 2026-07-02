package com.example.applicationtemp

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    var TAG = "LoginActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        display(msg = "onCreate method is called")
    }

    override fun onStart() {
        display(msg = "onStart method is called")
        super.onStart()
    }

    override fun onPause() {
        display(msg = "onPause method is called")
        super.onPause()
    }

    override fun onResume() {
        display(msg = "onResume method is called")
        super.onResume()
    }

    override fun onStop() {
        display(msg = "onStop methos is called")
        super.onStop()
    }

    override fun onDestroy() {
        display(msg = "onDestroy method is called")
        super.onDestroy()
    }



    fun display(msg:String){
        Log.i(TAG,msg)
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}
