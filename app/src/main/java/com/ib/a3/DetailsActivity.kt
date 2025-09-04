package com.ib.a3

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_details)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // getting references to the views in the activity
        val ivDetailsProductImage : ImageView = findViewById(R.id.ivDetailsProductImage)
        val tvDetailsProductName:TextView = findViewById(R.id.tvDetailsProductName)
        val tvDetailsProductDescription :TextView= findViewById(R.id.tvDetailsProductDescription)

        // getting the product object from the intent extras
        val product = intent.getSerializableExtra("product",Product::class.java)!!

        // updating the views with the product data
        ivDetailsProductImage.setImageResource(product.productImage)
        tvDetailsProductName.text = product.productName
        tvDetailsProductDescription.text = product.productDescription
    }
}