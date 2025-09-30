package com.example.tugas

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView

class Avatar : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.constraint_example)
        val checkBox = findViewById<CheckBox>(R.id.browcheckBox)
        val checkBox2 = findViewById<CheckBox>(R.id.eyeCheckBox)
        val checkBox3 = findViewById<CheckBox>(R.id.noseCheckBox)
        val checkBox4 = findViewById<CheckBox>(R.id.mouthCheckBox)

        val brow = findViewById<ImageView>(R.id.browImg)
        val eyes = findViewById<ImageView>(R.id.eyeImg)
        val nose = findViewById<ImageView>(R.id.noseImg)
        val mouth = findViewById<ImageView>(R.id.mouthImg)

        checkBox.setOnCheckedChangeListener { _, isChecked ->
            brow.visibility = if (isChecked) View.VISIBLE else View.INVISIBLE
        }

        // Eye checkbox toggle
        checkBox2.setOnCheckedChangeListener { _, isChecked ->
            eyes.visibility = if (isChecked) View.VISIBLE else View.INVISIBLE
        }

        // Nose checkbox toggle
        checkBox3.setOnCheckedChangeListener { _, isChecked ->
            nose.visibility = if (isChecked) View.VISIBLE else View.INVISIBLE
        }

        // Mouth checkbox toggle
        checkBox4.setOnCheckedChangeListener { _, isChecked ->
            mouth.visibility = if (isChecked) View.VISIBLE else View.INVISIBLE
        }
    }
}
