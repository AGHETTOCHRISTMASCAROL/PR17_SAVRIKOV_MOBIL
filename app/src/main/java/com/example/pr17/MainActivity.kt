package com.example.pr17

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener{

    private lateinit var buttonOkay: Button
    private lateinit var buttonCancel: Button
    private lateinit var buttonNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG,"Поиск View-элементов")
        buttonOkay = findViewById(R.id.buttonOkay)
        buttonCancel = findViewById(R.id.buttonCancel)
        buttonNext = findViewById(R.id.buttonNext)

        buttonOkay.setOnClickListener(this)
        buttonCancel.setOnClickListener(this)
        buttonNext.setOnClickListener(this)
    }

    override fun onClick(view: View){
        when(view.id){
            R.id.buttonOkay -> {
                Log.d(TAG,"Нажата Okay")
                Toast.makeText(this, "Нажали Okay", Toast.LENGTH_SHORT).show()
            }

            R.id.buttonCancel -> {
                Log.d(TAG,"Нажата Cancel")
                Toast.makeText(this, "Нажали Cancel", Toast.LENGTH_SHORT).show()
            }

            R.id.buttonNext -> {
                Log.d(TAG,"Нажата Next")
                intent = Intent(this, UriActivity::class.java)
                startActivity(intent)
            }
        }
    }
}