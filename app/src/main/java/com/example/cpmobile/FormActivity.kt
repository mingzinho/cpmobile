package com.example.cpmobile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class FormActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, FormFragment())
            .commit()
    }
}