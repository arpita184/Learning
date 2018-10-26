package com.example.arpita.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

// 1. Store # of Cuisine/Restaurant options
// 2. Decide! > Randomly decide from #1
// 3. Add New Food > Append to Cuisine/Restaurant options

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese", "American", "Indian", "Japanese", "Italian")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {
            val random = Random()
            val random_food = random.nextInt(foodList.count())
            selectedFoodTxt.text = foodList[random_food]
        }

        addFoodBtn.setOnClickListener {
            val newFood = addFoodTxt.text.toString()
            foodList.add(newFood)
            println(foodList)
            addFoodTxt.text.clear()
        }
    }
}
