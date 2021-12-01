package com.pandorina.newsappwithnavigation.ui

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.pandorina.newsappwithnavigation.Constant.PUBLISHER_ID
import com.pandorina.newsappwithnavigation.data.News
import com.pandorina.newsappwithnavigation.data.NewsData
import com.pandorina.newsappwithnavigation.databinding.FragmentNewsBinding

class NewsFragment : BaseFragment<FragmentNewsBinding>(FragmentNewsBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mAdapter = NewsAdapter()

        val mLayoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        mLayoutManager.gapStrategy = StaggeredGridLayoutManager.GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS
        binding.rvNews.layoutManager = mLayoutManager

        arguments?.let {
            val id = it.getInt(PUBLISHER_ID)
            val list = mutableListOf<News>()
            NewsData.getList.forEach{ item ->
                if(id == item.publisher_id){
                    list.add(item)
                    (activity as AppCompatActivity).supportActionBar?.title = item.publisher
                }
            }
            mAdapter.newsList = list
        } ?: kotlin.run {
            mAdapter.newsList = NewsData.getList
        }

        binding.rvNews.apply {
            adapter = mAdapter
            setHasFixedSize(true)
        }
    }
}