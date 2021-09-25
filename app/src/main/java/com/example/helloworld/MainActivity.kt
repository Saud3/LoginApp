package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val emailText = findViewById<TextView>(R.id.userName)
       val passwordText = findViewById<TextView>(R.id.ptPasswordText)
        val loginButton = findViewById<Button>(R.id.butLogin)
       // val signupButton = findViewById<Button>(R.id.btnSignup)


        loginButton.setOnClickListener {
            //if ((emailText.text=="a") && (passwordText.text== "1")){
                val intent = Intent(this,SignUpActivity::class.java)
                startActivity(intent)

        //}
           // else{
            //    Toast.makeText(this,"Invalid Input",Toast.LENGTH_LONG).show()
           //}
        }

    }
}
