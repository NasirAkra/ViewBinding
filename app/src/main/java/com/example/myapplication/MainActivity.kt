package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Ensure you use the correct ID for the button
        binding.print.setOnClickListener {
            if (binding.edit1.text.toString() != "" && binding.edit2.text.toString() != "") {
                val value1 = binding.edit1.text.toString().toInt()
                val value2 = binding.edit2.text.toString().toInt()
                val sum = value1 + value2
                Toast.makeText(this, "Sum is: $sum", Toast.LENGTH_LONG).show()
                binding.result.text = "Sum is: $sum"
            }
        }
    }
}
