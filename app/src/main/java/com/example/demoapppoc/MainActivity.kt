package com.example.demoapppoc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var adapterShopAdapter = ShopAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rcy_shop.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = adapterShopAdapter
        }
        fullAdapter()
    }

    private fun fullAdapter() {
        adapterShopAdapter.items = arrayShop
    }


    private val arrayShop = listOf(
        ShopItem(
            "Michael Clayton",
            123,
            "Address : 467 Điện Biên Phủ",
            "https://homepages.cae.wisc.edu/~ece533/images/airplane.png"
        ),
        ShopItem(
            "Nicole Schroeder",
            123,
            "Address : 467 Điện Biên Phủ",
            "https://homepages.cae.wisc.edu/~ece533/images/airplane.png"
        ),
        ShopItem(
            "Haley Cobb",
            123,
            "Address : 467 Điện Biên Phủ",
            "https://homepages.cae.wisc.edu/~ece533/images/airplane.png"
        ),
        ShopItem(
            "Susan Rowe",
            123,
            "Address : 467 Điện Biên Phủ",
            "https://homepages.cae.wisc.edu/~ece533/images/airplane.png"
        ),
        ShopItem(
            "Dr. Patrick Howard PhD",
            123,
            "Address : 467 Điện Biên Phủ",
            "https://homepages.cae.wisc.edu/~ece533/images/airplane.png"
        ),
        ShopItem(
            "Timothy Russell",
            123,
            "Address : 467 Điện Biên Phủ",
            "https://homepages.cae.wisc.edu/~ece533/images/airplane.png"
        ),
        ShopItem(
            "Chelsea Payne",
            123,
            "Address : 467 Điện Biên Phủ",
            "https://homepages.cae.wisc.edu/~ece533/images/airplane.png"
        )
        ,
        ShopItem(
            "Cody Burgess",
            123,
            "Address : 638 Kristin Parkway\\nPort Mary, VA 17032",
            "https://homepages.cae.wisc.edu/~ece533/images/airplane.png"
        )
        ,
        ShopItem(
            "Joshua Norris",
            123,
            "Address : Unit 7971 Box 2389\\nDPO AA 62085",
            "https://homepages.cae.wisc.edu/~ece533/images/airplane.png"
        )
    )
}
