package com.pallavi.passing_data2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class first_activity : AppCompatActivity() {

    lateinit var tvEnterName: TextView
    lateinit var etName: EditText
    lateinit var tvClass: TextView
    lateinit var etClass: EditText
    lateinit var tvAboutYou: TextView
    lateinit var etAbout: EditText
    lateinit var btnConfrim: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        tvEnterName = findViewById(R.id.tvEnterName)
        etName = findViewById(R.id.etName)
        tvClass = findViewById(R.id.tvClass)
        etClass = findViewById(R.id.etClass)
        tvAboutYou = findViewById(R.id.tvAboutYou)
        etAbout = findViewById(R.id.etAbout)
        btnConfrim = findViewById(R.id.btnConfrim)

        btnConfrim.setOnClickListener {
            if (etName.text.isEmpty()) {
                etName.error = "Enter Your Name"
                etName.requestFocus()

            } else if (etClass.text.isEmpty()) {
                etClass.error = "Enter your Class Name"
                etClass.requestFocus()

            } else if (etAbout.text.isEmpty()) {
                etAbout.error = "Enter Your About"
                etAbout.requestFocus()


            } else {

                var intent = Intent(this,next::class.java)
                intent.putExtra("UrName", etName.text.toString())
                intent.putExtra("UrClass", etClass.text.toString())
                intent.putExtra("UrAbout", etAbout.text.toString())
//

                Toast.makeText(this, "Confrimed", Toast.LENGTH_LONG).show()
                startActivity(intent)
            }

        }
    }
}



