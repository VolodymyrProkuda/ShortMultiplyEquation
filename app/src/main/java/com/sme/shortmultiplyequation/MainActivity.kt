package com.sme.shortmultiplyequation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sme.shortmultiplyequation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var a = "a"
    var b = "b"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonAB.setOnClickListener { abToa2b2() }
    }

    fun abToa2b2(){
        a = binding.editTextA.text.toString()
        b = binding.editTextB.text.toString()
        binding.textViewAbout2.text = "(" + a + "+" + b + ")\u00B2="+a + "²"+ "+"+"2*"+a+"*"+b+"+"+b+ "²"
        binding.textViewAbout3.text = "(" + a + "-" + b + ")\u00B2="+a + "²"+ "-"+"2*"+a+"*"+b+"+"+b+ "²"
        binding.textViewAbout4.text = "(" + a + "-" + b + ")(" + a + "+" + b + ")="+"" + a + "²-" + b + "\u00B2"

    }

}