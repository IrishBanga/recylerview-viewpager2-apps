package com.ib.a3.viewPager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

// adapter class for the gallery recycler view
class GalleryAdapter(private val galleryArrayList: ArrayList<Gallery>) :
    RecyclerView.Adapter<GalleryAdapter.ViewHolder>() {

    // inner class to hold the views with implementations of onCreateViewHolder, getItemCount,
    // and onBindViewHolder
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.imageView)
    }

    // function to create the view holder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(
                R.layout.gallery_list_item,
                parent, false
            )
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return galleryArrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // setting the image resource for the image view
        holder.imageView.setImageResource(galleryArrayList[position].imageId)
    }
}