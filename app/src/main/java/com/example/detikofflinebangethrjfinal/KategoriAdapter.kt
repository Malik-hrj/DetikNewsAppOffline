package com.example.detikofflinebangethrjfinal

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.detikofflinebangethrjfinal.fragment.Kategori

class KategoriAdapter (
    val context: Context,
    val listKategori: List<Kategori>
):RecyclerView.Adapter<KategoriAdapter.KategoriViewHolder>(){
    private val activity : MainActivity = context as MainActivity

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): KategoriViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.itemlist_kategori,parent,false)
        return KategoriViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listKategori.size
    }

    override fun onBindViewHolder(holder: KategoriViewHolder, position: Int) {
        holder.kategori.text = listKategori.get(position).kategori
        holder.itemView.setOnClickListener {
            context.startActivity(Intent(context, MainActivity::class.java)
                .putExtra("kategori_id", listKategori.get(position).idKategori))
            activity.finishMe()

        }


    }

    inner class KategoriViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val kategori:TextView = itemView.findViewById(R.id.list_kategori_item)


    }



}
