package com.example.sahibindencomproductlisting.ui.adapter

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView
import com.example.sahibindencomproductlisting.data.model.Product
import com.example.sahibindencomproductlisting.databinding.CardDesignBinding
import com.example.sahibindencomproductlisting.ui.viewModel.ProductViewModel
import com.google.android.material.snackbar.Snackbar
import java.time.format.TextStyle

class ProductAdapter(var mContext: Context, var productList: List<Product>, var viewModel: ProductViewModel)
    : RecyclerView.Adapter<ProductAdapter.CardViewHolder>() {

    inner class CardViewHolder( var view: CardDesignBinding ) : RecyclerView.ViewHolder(view.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val binding = CardDesignBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return productList.size

    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val product = productList.get(position)
        val view = holder.view

        view.imageViewProduct.setImageResource(
            mContext.resources.getIdentifier(product.image, "drawable", mContext.packageName)
        )
        view.cardViewProduct.setOnClickListener {
            Snackbar.make(it, "${product.description} başlıklı ürün seçildi", Snackbar.LENGTH_SHORT).show()
        }
        view.textViewDescription.text = product.description
        view.textViewLocation.text = product.location
        view.textViewPrice.text = "${product.price} TL"

        if(product.isDoping == true){
            view.cardViewProduct.setCardBackgroundColor(Color.parseColor("#E6FBD4"))
            view.textViewDescription.setTypeface(null, Typeface.BOLD)
        }
    }
}