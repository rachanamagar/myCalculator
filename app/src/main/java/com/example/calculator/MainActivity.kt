package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.calculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

     lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnclr.setOnClickListener {
            binding.tvInput.text = ""
            binding.tvOutput.text = ""
        }


        binding.btnZ.setOnClickListener {
            binding.tvInput.append("0")
        }
        binding.btn1.setOnClickListener {
            binding.tvInput.append("1")
        }
        binding.btn2.setOnClickListener {
            binding.tvInput.append("2")
        }
        binding.btn3.setOnClickListener {
            binding.tvInput.append("3")
        }
        binding.btn4.setOnClickListener {
            binding.tvInput.append("4")
        }
        binding.btn5.setOnClickListener {
            binding.tvInput.append("5")
        }
        binding.btn6.setOnClickListener {
            binding.tvInput.append("6")
        }
        binding.btn7.setOnClickListener {
            binding.tvInput.append("7")
        }
        binding.btn8.setOnClickListener {
            binding.tvInput.append("8")
        }
        binding.btn9.setOnClickListener {
            binding.tvInput.append("9")
        }

        binding.btnP.setOnClickListener {
            binding.tvInput.append(" + ")
        }
        binding.btnM.setOnClickListener {
            binding.tvInput.append(" - ")
        }
        binding.btnD.setOnClickListener {
            binding.tvInput.append(".")
        }
        binding.btnDi.setOnClickListener {
            binding.tvInput.append(" / ")
        }
        binding.btnLB.setOnClickListener {
            binding.tvInput.append("(")
        }
        binding.btnRB.setOnClickListener {
            binding.tvInput.append(")")
        }
        binding.btnx.setOnClickListener {
            binding.tvInput.append(" * ")
        }
        binding.btnZe.setOnClickListener {
            binding.tvInput.append("00")
        }


        //operation methods

        binding.btnE.setOnClickListener {

            val expression = ExpressionBuilder(binding.tvInput.text.toString()).build()
            val  result = expression.evaluate()
            val  longresult = result.toLong()

            if(result== longresult.toDouble()){
                binding.tvOutput.text= longresult.toString()
            }else{
                binding.tvOutput.text = result.toString()
            }
        }









    }
}