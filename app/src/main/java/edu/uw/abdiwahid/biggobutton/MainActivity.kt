package edu.uw.abdiwahid.biggobutton

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private var count = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById<Button>(R.id.btn_button)

        val text: TextView   = findViewById<TextView>(R.id.text1)

        var count = 0;
        button.setOnClickListener {
            button.setBackgroundColor(Color.GREEN)
            count++;
            if(count == 1) {
                button.setText("You clicked me 1 time")
                text.setText("You clicked me 1 time")

            }      else{
                button.setText("You clicked me $count times")
                text.setText("You clicked me $count times")
            }
        }
    }




}