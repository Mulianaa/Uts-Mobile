package com.benalu.muliana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.benalu.muliana.databinding.ActivityActivityloginBinding

class activitylogin : AppCompatActivity() {
    private lateinit var binding: ActivityActivityloginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityActivityloginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.LoginButton.setOnClickListener {
            val Username = binding.Usernamenya.text.toString()
            val Password = binding.Passwordnya.text.toString()
            val Gagal: String = "Username dan Password Salah"
            if (Username == "muliana" && Password == "54321") {
                val moveIntent = Intent(this@activitylogin, hitungluaspersegi::class.java)
                startActivity(moveIntent)
            } else {
                binding.Salah.text = Gagal
            }
        }

    }
}