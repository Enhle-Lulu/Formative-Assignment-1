package vcmsa.ci.nerasmeal_plan

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnSelect = findViewById<Button>(R.id.btnSelect)
        val btnReset = findViewById<Button>(R.id.btnReset)
        btnSelect?.setOnClickListener {
            val edtMeal = findViewById<EditText>(R.id.edtMeal)
            val selectionView = findViewById<TextView>(R.id.selectionView)
            btnReset?.setOnClickListener {
                edtMeal.text.clear() // Clears the input field
                selectionView.text = "" // Resets the TextView
            }
            val meals = edtMeal.text.toString()
            btnSelect.setOnClickListener {

                if (meals.isEmpty()) {
                    selectionView.text = "PLease enter a time of day"
                } else
                    if (meals == "Morning" || meals == "morning") {
                        selectionView.text =
                            "Bacon and Egg,French Toast,Muesli, All Bran, Tea, Cappuccino "
                    } else
                        if (meals == "Mid-Morning" || meals == "mid-morning") {
                            selectionView.text =
                                "Hard-boiled egg,Smoothie,Biscuits , Orange Juice, Apple Juice"
                        } else
                            if (meals == "Afternoon" || meals == "afternoon") {
                                selectionView.text =
                                    "Burger and Chips, Creme Soda, Chicken wrap, Water or lemonade;//"
                            } else
                                if (meals == "Mid-Afternoon" || meals == "mid-afternoon") {
                                    selectionView.text =
                                        "Granola and yogurt,Crackers with cottage cheese, mocktail, water "
                                } else
                                    if (meals == "Dinner" || meals == "dinner") {
                                        selectionView.text =
                                            "Dumpling or rice with beef stew, malva pudding or tiramisu, wine or cranberry juice"



                                    }

                                    else
                                        {
                                            selectionView.text = "Not found- please enter time of day"
                                        }






























































                //ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
           // val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
           // v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
           // insets
        }
    }
}}