package com.benalu.muliana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.benalu.muliana.databinding.ActivityHitungluaskuBinding

class hitungluaspersegi : AppCompatActivity() {
    private lateinit var binding: ActivityHitungluaskuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHitungluaskuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.Hitung.setOnClickListener {
            val panjang = binding.Panjang.text.toString()
            val lebar = binding.Lebar.text.toString()
            val hasil = panjang.toInt() * lebar.toInt()
            binding.Hasil.text = hasil.toString()
        }
        binding.Kembali.setOnClickListener {
            val Kembali = Intent(this@hitungluaspersegi, activitylogin::class.java)
            startActivity(Kembali)
        }
    }
}