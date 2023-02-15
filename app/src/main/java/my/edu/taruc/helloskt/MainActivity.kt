package my.edu.taruc.helloskt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

// Class Name/ Variable Name/ Data Types/ Class Type
class MainActivity : AppCompatActivity() {

    // fun = function
    //onCreate = the main function
    override fun onCreate(savedInstanceState: Bundle?) {
        // super = parent class
        super.onCreate(savedInstanceState)
        // Load the UI file
        // R = resource class
        setContentView(R.layout.activity_main)

        // Declare value or variable
        // val = value (static)
        // var = variable
        val textViewName: TextView = findViewById(R.id.textViewName)
        val buttonShowName: Button = findViewById(R.id.buttonShowName)
        val buttonHideName: Button = findViewById(R.id.buttonHideName)
        val qrCode: ImageView = findViewById(R.id.qrCode)

        buttonShowName.setOnClickListener {
            //textViewName.text = "Yeoh Teng Li" // Not good
            textViewName.text = getString(R.string.my_name) // Recommended
            textViewName.visibility = View.VISIBLE
        }

        buttonHideName.setOnClickListener {
            textViewName.visibility = View.INVISIBLE

        }
    }
}