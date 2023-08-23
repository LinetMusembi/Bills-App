package com.example.billsmanagement.ui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.billsmanagement.databinding.ActivityMainBinding
import com.example.billsmanagement.utils.Constants

class MainActivity : AppCompatActivity() {
//    the binding property is used to access the views in the activity xml
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        redirectUser()
    }
    fun redirectUser(){
        val sharedPrefs=getSharedPreferences(Constants.PREFS,Context.MODE_PRIVATE)
        val userId=sharedPrefs.getString(Constants.USER_ID,Constants.EMPTY_STRING)
        if (userId.isNullOrBlank()){
            startActivity(Intent(this,Login::class.java))

        }
        else{
            startActivity(Intent(this,HomePage::class.java))
        }
        finish()
    }
}


