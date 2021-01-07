package com.example.detikofflinebangethrjfinal.fragment

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Kategori(
    val kategori:String?,
    val idKategori:Int?):Parcelable{
    object KategoriModel{
        val kategoriList = listOf(
            Kategori(
                "Terbaru",
                0
            ),
            Kategori(
                "Teknologi",
                1
            ),
            Kategori(
                "Kesehatan",
                2
            ),
            Kategori(
                "Olahraga",
                3
            ),
            Kategori(
                "Otomotif",
                4
            )
        )
    }
}
