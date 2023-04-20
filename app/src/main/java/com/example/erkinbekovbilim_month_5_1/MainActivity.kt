package com.example.erkinbekovbilim_month_5_1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.erkinbekovbilim_month_5_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView {

    lateinit var binding: ActivityMainBinding
    private val presenter = Presenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        plusBtn()
        minusBnt()
        presenter.attachView(this)
    }

    private fun minusBnt() {
        binding.apply {
            btnMinus.setOnClickListener {
                presenter.minus()
            }
        }
    }

    private fun plusBtn() {
        binding.apply {
            btnPlus.setOnClickListener{
                presenter.plus()
            }
        }
    }

    override fun showCount(count: Int) {
        binding.apply {
            tvZero.text = count.toString()
            }
        }

    override fun showToast() {
        Toast.makeText(applicationContext, "Поздравляем!", Toast.LENGTH_SHORT).show()
    }

    override fun changeColor() {
        binding.apply {
            tvZero.setTextColor(getColor(R.color.green))
        }
    }
}