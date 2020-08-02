package com.example.openphone

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOpenUrl.setOnClickListener(this)
        btnOpenPhone.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view) {
            btnOpenUrl -> {
                Toast.makeText(applicationContext,"Вы открыли браузер",Toast.LENGTH_SHORT).show()
                 val intent = Intent(Intent.ACTION_VIEW)
                    Uri.parse("http://developer.android.com")
                    startActivity(intent)
                }

            btnOpenPhone -> {
                Toast.makeText(applicationContext,"Вы открыли телефон",Toast.LENGTH_SHORT).show()
                val intent = Intent(Intent.ACTION_DIAL)
                Uri.parse("tel:+996 508 170 177")
                startActivity(intent)
            }

        }
    }
}
