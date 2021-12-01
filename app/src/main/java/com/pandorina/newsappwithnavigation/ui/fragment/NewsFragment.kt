package com.pandorina.newsappwithnavigation.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.pandorina.newsappwithnavigation.data.model.News
import com.pandorina.newsappwithnavigation.data.resource.NewsData
import com.pandorina.newsappwithnavigation.databinding.FragmentNewsBinding
import com.pandorina.newsappwithnavigation.ui.adapter.NewsAdapter
import com.pandorina.newsappwithnavigation.util.Constant.PUBLISHER_ID

class NewsFragment : BaseFragment<FragmentNewsBinding>(FragmentNewsBinding::inflate) {
    private val mAdapter = NewsAdapter()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

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
            mAdapter.newsList = NewsData.randomList
        }

        binding.rvNews.apply {
            adapter = mAdapter
            setHasFixedSize(true)
        }
    }
}