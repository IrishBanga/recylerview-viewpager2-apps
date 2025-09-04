package com.ib.a3

import java.io.Serializable

// serializable data class to store the product data
data class Product(val productImage: Int, val productName: String, val productDescription: String) :
    Serializable