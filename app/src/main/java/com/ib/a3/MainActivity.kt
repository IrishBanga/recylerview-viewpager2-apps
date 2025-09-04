package com.ib.a3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // getting the reference to the recycler view
        val rvProductList: RecyclerView = findViewById(R.id.rvProductList)

        // initializing the product list
        val productList: ArrayList<Product> = ArrayList()

        // adding sample data to the product list
        addSampleData(productList)

        // setting the adapter for the recycler view
        rvProductList.adapter = ProductListAdapter(productList)
        // setting the layout manager for the recycler view
        rvProductList.layoutManager = LinearLayoutManager(this)
    }

    // helper function to add sample data to the product list
    private fun addSampleData(productList: ArrayList<Product>): ArrayList<Product> {
        productList.add(
            Product(
                R.drawable.p001,
                "Sports Steering Wheel",
                "A premium sports steering wheel for enhanced grip and control."
            )
        )
        productList.add(
            Product(
                R.drawable.p002,
                "Carbon Fiber Spoiler",
                "A lightweight and stylish carbon fiber spoiler for improved aerodynamics."
            )
        )
        productList.add(
            Product(
                R.drawable.p003,
                "Performance Exhaust System",
                "A high-performance exhaust system for increased power and aggressive sound."
            )
        )
        productList.add(
            Product(
                R.drawable.p004,
                "LED Headlights",
                "Upgrade your headlights with bright and efficient LED bulbs."
            )
        )
        productList.add(
            Product(
                R.drawable.p005,
                "Alloy Wheels Set",
                "Set of four lightweight and stylish alloy wheels to enhance your car's appearance."
            )
        )
        productList.add(
            Product(
                R.drawable.p006,
                "Lowering Springs Kit",
                "Improve handling and appearance with a set of performance lowering springs."
            )
        )
        productList.add(
            Product(
                R.drawable.p007,
                "Cold Air Intake System",
                "Increase engine performance with a cold air intake system."
            )
        )
        productList.add(
            Product(
                R.drawable.p008,
                "Carbon Fiber Interior Trim",
                "Upgrade your interior with stylish carbon fiber trim pieces."
            )
        )
        productList.add(
            Product(
                R.drawable.p009,
                "Performance Brake Kit",
                "Upgrade your brakes for improved stopping power and fade resistance."
            )
        )
        productList.add(
            Product(
                R.drawable.p001,
                "Racing Bucket Seats",
                "Replace your seats with comfortable and supportive racing bucket seats."
            )
        )
        productList.add(
            Product(
                R.drawable.p001,
                "Body Kit Package",
                "Transform your car's appearance with a complete body kit package."
            )
        )
        productList.add(
            Product(
                R.drawable.p001,
                "Tuned ECU Chip",
                "Optimize engine performance with a custom-tuned ECU chip."
            )
        )
        productList.add(
            Product(
                R.drawable.p013,
                "Carbon Fiber Mirror Caps",
                "Upgrade your side mirrors with lightweight and stylish carbon fiber."
            )
        )
        productList.add(
            Product(
                R.drawable.p001,
                "High-Flow Catalytic Converter",
                "Improve exhaust flow and performance with a high-flow catalytic converter."
            )
        )
        productList.add(
            Product(
                R.drawable.p016,
                "Sports Suspension Kit",
                "Fully adjustable suspension for precise handling."
            )
        )
        productList.add(
            Product(
                R.drawable.p001,
                "Turbocharger Kit",
                "Add a turbocharger for significant power gains and thrilling performance."
            )
        )

        productList.add(
            Product(
                R.drawable.p017,
                "Performance Air Filter",
                "Upgrade your air filter for improved airflow and power gains."
            )
        )
        productList.add(
            Product(
                R.drawable.p018,
                "Aluminum Shift Knob",
                "Replace your shift knob with a lightweight and stylish aluminum knob."
            )
        )
        productList.add(
            Product(
                R.drawable.p019,
                "Brake Pads",
                "Hybrid brake pads for reliable performance and stopping power."
            )
        )
        productList.add(
            Product(
                R.drawable.p020,
                "Stainless Steel Exhaust Headers",
                "Improve exhaust flow and engine response with stainless steel headers."
            )
        )
        productList.add(
            Product(
                R.drawable.p021,
                "Custom Shift Boot",
                "Personalize your interior with a custom-designed shift boot."
            )
        )
        productList.add(
            Product(
                R.drawable.p016,
                "Suspension Kit",
                "Adjustable suspensions for fine-tuning your car's ride height and handling."
            )
        )
        productList.add(
            Product(
                R.drawable.p023,
                "High-Performance Radiator",
                "Improve engine cooling with a high-performance radiator."
            )
        )
        productList.add(
            Product(
                R.drawable.p024,
                "Off-Road LED Light Bar",
                "Equip your vehicle with a powerful off-road LED light bar for enhanced visibility."
            )
        )
        productList.add(
            Product(
                R.drawable.p021,
                "Custom Shift Boot",
                "Personalize your interior with a custom-designed shift boot."
            )
        )

        productList.add(
            Product(
                R.drawable.p001,
                "Sports Steering Wheel",
                "A premium sports steering wheel for enhanced grip and control."
            )
        )
        productList.add(
            Product(
                R.drawable.p002,
                "Carbon Fiber Spoiler",
                "A lightweight and stylish carbon fiber spoiler for improved aerodynamics."
            )
        )
        productList.add(
            Product(
                R.drawable.p003,
                "Performance Exhaust System",
                "A high-performance exhaust system for increased power and aggressive sound."
            )
        )
        productList.add(
            Product(
                R.drawable.p004,
                "LED Headlights",
                "Upgrade your headlights with bright and efficient LED bulbs."
            )
        )
        productList.add(
            Product(
                R.drawable.p005,
                "Alloy Wheels Set",
                "Set of four lightweight and stylish alloy wheels to enhance your car's appearance."
            )
        )
        productList.add(
            Product(
                R.drawable.p006,
                "Lowering Springs Kit",
                "Improve handling and appearance with a set of performance lowering springs."
            )
        )
        productList.add(
            Product(
                R.drawable.p007,
                "Cold Air Intake System",
                "Increase engine performance with a cold air intake system."
            )
        )
        productList.add(
            Product(
                R.drawable.p001,
                "Body Kit Package",
                "Transform your car's appearance with a complete body kit package."
            )
        )
        productList.add(
            Product(
                R.drawable.p008,
                "Carbon Fiber Interior Trim",
                "Upgrade your interior with stylish carbon fiber trim pieces."
            )
        )
        productList.add(
            Product(
                R.drawable.p009,
                "Performance Brake Kit",
                "Upgrade your brakes for improved stopping power and fade resistance."
            )
        )
        productList.add(
            Product(
                R.drawable.p001,
                "Tuned ECU Chip",
                "Optimize engine performance with a custom-tuned ECU chip."
            )
        )
        productList.add(
            Product(
                R.drawable.p013,
                "Carbon Fiber Mirror Caps",
                "Upgrade your side mirrors with lightweight and stylish carbon fiber."
            )
        )
        productList.add(
            Product(
                R.drawable.p001,
                "Turbocharger Kit",
                "Add a turbocharger for significant power gains and thrilling performance."
            )
        )
        productList.add(
            Product(
                R.drawable.p016,
                "Sports Suspension Kit",
                "Fully adjustable suspension for precise handling."
            )
        )
        productList.add(
            Product(
                R.drawable.p017,
                "Performance Air Filter",
                "Upgrade your air filter for improved airflow and power gains."
            )
        )
        productList.add(
            Product(
                R.drawable.p001,
                "Racing Bucket Seats",
                "Replace your seats with comfortable and supportive racing bucket seats."
            )
        )
        productList.add(
            Product(
                R.drawable.p018,
                "Aluminum Shift Knob",
                "Replace your shift knob with a lightweight and stylish aluminum knob."
            )
        )
        productList.add(
            Product(
                R.drawable.p019,
                "Brake Pads",
                "Hybrid brake pads for reliable performance and stopping power."
            )
        )
        productList.add(
            Product(
                R.drawable.p020,
                "Stainless Steel Exhaust Headers",
                "Improve exhaust flow and engine response with stainless steel headers."
            )
        )
        productList.add(
            Product(
                R.drawable.p001,
                "High-Flow Catalytic Converter",
                "Improve exhaust flow and performance with a high-flow catalytic converter."
            )
        )

        productList.add(
            Product(
                R.drawable.p021,
                "Custom Shift Boot",
                "Personalize your interior with a custom-designed shift boot."
            )
        )
        productList.add(
            Product(
                R.drawable.p016,
                "Suspension Kit",
                "Adjustable suspensions for fine-tuning your car's ride height and handling."
            )
        )
        productList.add(
            Product(
                R.drawable.p023,
                "High-Performance Radiator",
                "Improve engine cooling with a high-performance radiator."
            )
        )
        productList.add(
            Product(
                R.drawable.p024,
                "Off-Road LED Light Bar",
                "Equip your vehicle with a powerful off-road LED light bar for enhanced visibility."
            )
        )
        productList.add(
            Product(
                R.drawable.p021,
                "Custom Shift Boot",
                "Personalize your interior with a custom-designed shift boot."
            )
        )

        return productList
    }

}