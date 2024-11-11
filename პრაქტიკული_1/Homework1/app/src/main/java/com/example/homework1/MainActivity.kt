package com.example.homework1

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.homework1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSendMessage.setOnClickListener {
            val number = binding.etRecipientNumber.text.toString()
            val message = binding.etMessage.text.toString()
            if (number.isBlank() || message.isBlank()) {
                Toast.makeText(this, "Fields are empty!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("number", number)
            intent.putExtra("message", message)
            startActivity(intent)
        }
    }
}
