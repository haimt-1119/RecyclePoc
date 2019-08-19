package com.example.demoapppoc

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_shop.view.*
import kotlin.properties.Delegates

class ShopAdapter : RecyclerView.Adapter<ShopAdapter.ShopViewHolder>(),
    AutoUpdatableAdapter {

    var items: List<ShopItem> by Delegates.observable(emptyList()) { prop, old, new ->
        autoNotify(old, new) { o, n -> true }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopViewHolder {
        return ShopViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.item_shop, parent, false))
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ShopViewHolder, position: Int) {
        holder.bind(items[position])
    }

    class ShopViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(shopItem: ShopItem) = with(itemView) {
            tv_shopName.text = shopItem.shop
            tv_price.text = "Price: " + shopItem.price.toString()
            tv_address.text = shopItem.address
            Glide.with(context).load(shopItem.urlImage).into(img_shop)
        }
    }
}