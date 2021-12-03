package com.pandorina.newsappwithnavigation.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions

@BindingAdapter("loadImage")
fun ImageView.loadImage(imageUri: String){
    Glide.with(this).load(imageUri)
        .transition(DrawableTransitionOptions.withCrossFade())
        .centerCrop()
        .into(this)
}