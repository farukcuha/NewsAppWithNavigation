package com.pandorina.newsappwithnavigation.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.pandorina.newsappwithnavigation.R
import com.pandorina.newsappwithnavigation.data.NewsData
import com.pandorina.newsappwithnavigation.databinding.FragmentDetailBinding

class DetailFragment : BaseFragment<FragmentDetailBinding>(FragmentDetailBinding::inflate) {
    private val args: DetailFragmentArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        NewsData.getList.forEach{
            if(args.newsId == it.id){
                binding.news = it
            }
        }
    }
}