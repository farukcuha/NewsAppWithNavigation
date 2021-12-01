package com.pandorina.newsappwithnavigation.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("loadImage")
fun ImageView.loadImage(imageUri: String){
    Glide.with(this).load(imageUri).centerCrop().thumbnail(0.3f).into(this)
}