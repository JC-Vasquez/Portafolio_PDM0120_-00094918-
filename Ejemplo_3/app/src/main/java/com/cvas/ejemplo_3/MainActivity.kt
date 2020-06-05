package com.cvas.ejemplo_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AbsListView
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var  nameEditText: EditText
    lateinit var nameButton: Button
    lateinit var nameDisplayTexView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bingView()
        addEventsListener()
    }

    fun bingView(){
        nameEditText = findViewById(R.id.et_name)
        nameButton = findViewById(R.id.bt_send_name)
        nameDisplayTexView = findViewById(R.id.tv_display_name)
    }

    fun addEventsListener(){
        nameButton.setOnClickListener {
            var name = nameEditText.text

            if (name.isEmpty()) {
                nameDisplayTexView.text = getString(R.string.notification_nombre)
            } else {
                nameDisplayTexView.text = name
            }
        }
    }

}
