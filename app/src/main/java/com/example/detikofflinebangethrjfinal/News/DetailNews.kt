package com.example.detikofflinebangethrjfinal.News

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.detikofflinebangethrjfinal.R
import kotlinx.android.synthetic.main.activity_detail_news.*

class DetailNews : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_news)
        val intent = intent
        val title = intent.getStringExtra("title")
        val img = intent.getIntExtra("img",
            R.drawable.img_news1
        )
        val description = intent.getStringExtra("description")
        val author = intent.getStringExtra("author")
        title_detail.text = title
        img_detail.setImageResource(img)
        deskripsi_detail.text = description
        author_detail.text = author
        btnBack.setOnClickListener {
            finish()
        }
        btnBack2.setOnClickListener {
            finish()
        }

    }
}
