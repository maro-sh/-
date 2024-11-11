package com.example.homework1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.homework1.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val number = intent.getStringExtra("number")
        val message = intent.getStringExtra("message")

        binding.etRecipientNumber.setText(number)
        binding.etMessage.setText(message)

        binding.btnClear.setOnClickListener {
            binding.etRecipientNumber.text?.clear()
            binding.etMessage.text?.clear()
        }
    }
}