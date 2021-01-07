package com.example.detikofflinebangethrjfinal

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.detikofflinebangethrjfinal.News.News
import com.example.detikofflinebangethrjfinal.News.DetailNews

class HomeAdapter (
    val context: Context,
    val listArticles:List<News>
):RecyclerView.Adapter<HomeAdapter.HomeViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeAdapter.HomeViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.itemlist_home, parent, false)
        return HomeViewHolder(view)

    }

    override fun getItemCount(): Int {
        return listArticles.size
    }

    override fun onBindViewHolder(holder: HomeAdapter.HomeViewHolder, position: Int) {
        holder.titleHome.text = listArticles.get(position).title
        holder.imgPhoto.setImageResource(listArticles.get(position).img!!)

        holder.itemView.setOnClickListener {
            context.startActivity(Intent(context,
                DetailNews::class.java)
                .putExtra("title", listArticles.get(position).title)
                .putExtra("img", listArticles.get(position).img!!)
                .putExtra("author", listArticles.get(position).author)
                .putExtra("description", listArticles.get(position).description))
        }

    }

    inner class HomeViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        val titleHome: TextView = itemView.findViewById(R.id.title_detail)
        val imgPhoto: ImageView = itemView.findViewById(R.id.img_logo)
    }

}