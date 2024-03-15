package com.itis.zoohelp.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.itis.zoohelp.R
import com.itis.zoohelp.presentation.screens.authorization.AuthorizationFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.main_fragment_container, AuthorizationFragment(), "TAG").commit()
    }
}