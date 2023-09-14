package com.example.wishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var emails: List<Email>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailsRV = findViewsById<RecyclerView>(R.id.emailsRv)

        emails = EmailFetcher.getEmails()

        val adapter = EmailAdapter(emails as MutableList<Email>)

        emailsRv.adapter = adapter

        emailsRv.layoutManager = LinearLayoutManager(this)

        val button = findViewById<Button>(R.id.button)

        var guessView = findViewById<TextView>(R.id.textinput)
        button.setOnClickListener{

        }

        Toast.makeText(it.context, "Clicked Button ", Toast.LENGTH_SHORT).show()



    }
}