package com.example.pr17

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class UriActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var buttonMap: Button
    private lateinit var buttonPhone: Button
    private lateinit var buttonSite: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uri)

        buttonMap = findViewById(R.id.buttonMap)
        buttonPhone = findViewById(R.id.buttonPhone)
        buttonSite = findViewById<Button?>(R.id.buttonSite)

        buttonMap.setOnClickListener(this)
        buttonPhone.setOnClickListener(this)
        buttonSite.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when(view.id){
            R.id.buttonMap -> {
                intent = Intent()
                intent.action = Intent.ACTION_VIEW
                intent.data = Uri.parse("geo:55.754283,37.62002")
                startActivity(intent)
            }

            R.id.buttonPhone -> {
                intent = Intent(Intent.ACTION_DIAL)
                intent.data = Uri.parse("tel:12345")
                startActivity(intent)
            }

            R.id.buttonSite -> {
                intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://developer.android.com"))
                startActivity(intent)
            }
        }
    }
}