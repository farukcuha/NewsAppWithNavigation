package com.pandorina.newsappwithnavigation.ui.fragment

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.navArgs
import com.pandorina.newsappwithnavigation.data.resource.NewsData
import com.pandorina.newsappwithnavigation.databinding.FragmentDetailBinding

class DetailFragment : BaseFragment<FragmentDetailBinding>(FragmentDetailBinding::inflate) {
    private val args: DetailFragmentArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        NewsData.getList.forEach{
            if(args.newsId == it.id){
                binding.news = it
                (activity as AppCompatActivity).supportActionBar?.title = it.title
            }
        }
    }
}