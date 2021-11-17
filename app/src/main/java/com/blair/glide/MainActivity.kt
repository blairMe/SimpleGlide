package com.blair.glide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val image = "https://cdn.pixabay.com/photo/2018/05/03/21/49/android-3372580_960_720.png"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image1 = imageOne
        val image2 = imageTwo
        val image3 = imageThree

        Glide.with(this)
            .load(image)
            .into(image1)

        Glide.with(this)
            .load(image)
            .fitCenter()
            .circleCrop()
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .placeholder(R.drawable.img_placeholder)
            .into(image2)

        Glide.with(this)
            .load(image)
            .override(300, 400)
            .centerCrop()
            .error(R.drawable.img_placeholder)
            .into(image3)

    }
}