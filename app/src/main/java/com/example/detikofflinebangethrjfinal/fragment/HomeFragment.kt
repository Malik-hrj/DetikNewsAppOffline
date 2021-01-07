package com.example.detikofflinebangethrjfinal.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.detikofflinebangethrjfinal.News.News
import com.example.detikofflinebangethrjfinal.HomeAdapter
import com.example.detikofflinebangethrjfinal.R

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {
    lateinit var articles:String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val rv = view?.findViewById<RecyclerView>(R.id.rvHome)
        val homeAdapter = HomeAdapter(
            context!!,
            News.ArticleModel.articlesKategori[articles.toInt()]
        )
        rv?.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        rv?.adapter = homeAdapter
        return view
    }

    fun newInstance(): HomeFragment {
        val fragment = HomeFragment()
        return fragment
    }

}
