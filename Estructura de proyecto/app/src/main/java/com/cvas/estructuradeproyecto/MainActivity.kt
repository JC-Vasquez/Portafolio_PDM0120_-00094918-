package com.cvas.estructuradeproyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var mDisplayLayoutText : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mDisplayLayoutText =findViewById(R.id.tv_display_text)

        mDisplayLayoutText.text = "Texto agregado desde codigo"
    }
}
