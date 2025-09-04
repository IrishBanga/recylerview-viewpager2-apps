package com.ib.a3

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// adapter class for the product recycler view
class ProductListAdapter(private val productsList: ArrayList<Product>) :
    RecyclerView.Adapter<ProductListAdapter.ViewHolder>() {

    // inner class to hold the views with implementations of onCreateViewHolder, getItemCount,
    // and onBindViewHolder
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        // getting references to the views in the list item
        private val ivProductImage: ImageView = view.findViewById(R.id.ivProductImage)
        private val tvProductName: TextView = view.findViewById(R.id.tvProductName)
        private val tvProductDescription: TextView = view.findViewById(R.id.tvProductDescription)

        // function to bind the product data to the views
        fun bind(product: Product) {
            ivProductImage.setImageResource(product.productImage)
            tvProductName.text = product.productName
            tvProductDescription.text = product.productDescription
        }
    }

    // function to create the view holder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(
                R.layout.product_list_item,
                parent, false
            )
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return productsList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // setting the different views with the product data
        holder.bind(productsList[position])

        // adding a click listener to the item view so that when an item is clicked,
        // we navigate to the details activity
        holder.itemView.setOnClickListener {
            val product = productsList[position]
            // defining an intent to navigate to the details activity
            val detailsActivityIntent = Intent(holder.itemView.context, DetailsActivity::class.java)
            // passing the product object to the details activity
            detailsActivityIntent.putExtra("product", product)
            // starting the details activity
            holder.itemView.context.startActivity(detailsActivityIntent)
        }
    }


}