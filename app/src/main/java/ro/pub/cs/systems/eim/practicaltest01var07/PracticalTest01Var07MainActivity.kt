package ro.pub.cs.systems.eim.practicaltest01var07

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.isDigitsOnly
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var stg_sus: EditText
    private lateinit var dr_sus: EditText
    private lateinit var stg_jos: EditText
    private lateinit var dr_jos: EditText

    private lateinit var random: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_practical_test01_var07_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        stg_sus = findViewById(R.id.c00)
        dr_sus = findViewById(R.id.c01)
        stg_jos = findViewById(R.id.c10)
        dr_jos = findViewById(R.id.c11)
        random = findViewById<Button>(R.id.random)

        random.setOnClickListener {
            if(stg_sus.text.toString().isEmpty() || !isNumeric(stg_sus.text.toString())){
                val result = (1..10).random()
                stg_sus.setText(result.toString())
            }

            if(stg_jos.text.toString().isEmpty() || !isNumeric(stg_jos.text.toString())){
                stg_jos.text.clear()
                val result = (1..10).random()
                stg_jos.setText(result.toString())
            }

            if(dr_jos.text.toString().isEmpty()|| !isNumeric(dr_jos.text.toString())){
                val result = (1..10).random()
                dr_jos.setText(result.toString())
            }

            if(dr_sus.text.toString().isEmpty()|| !isNumeric(dr_sus.text.toString())){
                val result = (1..10).random()
                dr_sus.setText(result.toString())
            }

        }


    }

    fun isNumeric(toCheck: String): Boolean {
        val regex = "-?[0-9]+(\\.[0-9]+)?".toRegex()
        return toCheck.matches(regex)
    }
}