package com.ib.a3.viewPager

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2

class MainActivityViewPager2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_view_pager2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // getting reference to the view pager
        val vpGallery : ViewPager2 = findViewById(R.id.vpGallery)

        // creating an array list of Gallery objects
        val galleryArrayList: ArrayList<Gallery> = ArrayList()

        // adding images to the gallery array list
        galleryArrayList.addAll(
            listOf(
            Gallery(R.drawable.p001),
            Gallery(R.drawable.p002),
            Gallery(R.drawable.p003),
            Gallery(R.drawable.p004),
            Gallery(R.drawable.p005),
            Gallery(R.drawable.p006),
            Gallery(R.drawable.p007),
        ))

        // creating an instance of the GalleryAdapter and passing the gallery array list
        val galleryAdapter = GalleryAdapter(galleryArrayList)
        // setting the adapter for the view pager
        vpGallery.adapter = galleryAdapter
    }
}