package ro.pub.cs.systems.eim.practicaltest01var07

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.jvm.java

class PracticalTest01Var07SecondaryActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_practical_test01_var07_secondary)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main2)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val s00 = intent.getStringExtra("c00")
        findViewById<EditText>(R.id.s00).setText(s00)
        val s01 = intent.getStringExtra("c01")
        findViewById<EditText>(R.id.s01).setText(s01)
        val s10 = intent.getStringExtra("c10")
        findViewById<EditText>(R.id.s10).setText(s10)
        val s11 = intent.getStringExtra("c11")
        findViewById<EditText>(R.id.s11).setText(s11)

        val sum = findViewById<Button>(R.id.sum)
        val product = findViewById<Button>(R.id.product)
        var suma = 0
        var produs = 1

        sum.setOnClickListener {
            suma = s00.toString().toInt() + s01.toString().toInt() + s10.toString().toInt() + s11.toString().toInt()

        }

        product.setOnClickListener {
            produs *= s00.toString().toInt() * s01.toString().toInt() * s10.toString().toInt() * s11.toString().toInt()
        }





    }
}