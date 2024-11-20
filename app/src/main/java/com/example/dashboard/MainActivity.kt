package com.example.dashboard

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    private lateinit var boxcard1: CardView
    private lateinit var boxcard2: CardView
    private lateinit var boxcard3: CardView
    private lateinit var boxcard4: CardView
    private lateinit var boxcard5: CardView
    private lateinit var boxcard6: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi card views
        boxcard1 = findViewById(R.id.boxcard1)
        boxcard2 = findViewById(R.id.boxcard2)
        boxcard3 = findViewById(R.id.boxcard3)
        boxcard4 = findViewById(R.id.boxcard4)
        boxcard5 = findViewById(R.id.boxcard5)
        boxcard6 = findViewById(R.id.boxcard6)

        // Akses Loket 1
        boxcard1.setOnClickListener {
            val intent = Intent(this, Loket1::class.java)
            startActivity(intent)
        }

        // Akses Loket 2
        boxcard2.setOnClickListener {
            val intent = Intent(this, Loket2::class.java)
            startActivity(intent)
        }

        // Akses Loket 3
        boxcard3.setOnClickListener {
            val intent = Intent(this, Loket3::class.java)
            startActivity(intent)
        }

        // Akses Loket 4
        boxcard4.setOnClickListener {
            val intent = Intent(this, Loket4::class.java)
            startActivity(intent)
        }

        // Akses Loket 5
        boxcard5.setOnClickListener {
            val intent = Intent(this, Loket5::class.java)
            startActivity(intent)
        }

        // Akses Loket 6
        boxcard6.setOnClickListener {
            val intent = Intent(this, Loket6::class.java)
            startActivity(intent)
        }
    }
}
