package com.example.disney

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.disney.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Menggunakan View Binding
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mendapatkan data yang dikirim melalui intent
        val photo = intent.getIntExtra("EXTRA_PHOTO", R.drawable.person_circle)
        val name = intent.getStringExtra("EXTRA_NAME") ?: "Cartoon Name"
        val tahun = intent.getStringExtra("EXTRA_TAHUN") ?: "Tahun"
        val pencipta = intent.getStringExtra("EXTRA_PENCIPTA") ?: "Pencipta"
        val description = intent.getStringExtra("EXTRA_DESCRIPTION") ?: "Description"

        // Mengatur data ke tampilan
        binding.dataPhoto.setImageResource(photo)
        binding.dataName.text = name
        binding.dataTahun.text = tahun
        binding.dataPencipta.text = pencipta
        binding.dataDescription.text = description
    }
}
