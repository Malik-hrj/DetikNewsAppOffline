package com.example.detikofflinebangethrjfinal.News

import android.os.Parcelable
import com.example.detikofflinebangethrjfinal.R
import kotlinx.android.parcel.Parcelize

@Parcelize
data class News(
    val title:String?,
    val author:String?,
    val img:Int?,
    val description:String?
    ): Parcelable {
    object ArticleModel{
        val articlesKategori = listOf(
            listOf(
                News(
                    "Pasar ramai dikunjungi warga meskipun wabah covid 19 belum dinyatakan usai",
                    "detikcom | 1 Jam yang lalu",
                    R.drawable.img_news1,
                    "Semua pasar ramai sehingga pedangan menjadi rentan terkenea covid 19"
                ),

                News(
                    "Kapal Nelayan menyalurkan bansos masyarakat Sulawesi",
                    "detikcom | 1 Jam yang lalu",
                    R.drawable.img_news2,
                    "Ternyata dibalik berjuangnya mereka dalam mencari rezeki para nelayan dapat membagikan bansos ke masyarakay"
                ),

                News(
                    "Macet mulai terjadi di wilayah jalur pemudik semarang",
                    "detikcom | 2 jam yang lalu",
                    R.drawable.img_news3,
                    "Macet kembali terjadi di jalur semarang"
                ),

                News(
                    "Jelang new normal jakarta macet lagi",
                    "detikcom | 3 jam yang lalu",
                    R.drawable.img_news4,
                    "Jakarta kembali macet"
                ),

                News(
                    "Dukung indonesia perangi covid-19, sampoerna donasi ventilator dan APD Full Set",
                    "detikcom | 4 jam yang lalu",
                    R.drawable.img_news5,
                    "Isi desc"
                ),

                News(
                    "Saat risma jelaskan soal penanganan corona pada kepala BNpB dan Menkes",
                    "detikcom | 5 jam yang lalu",
                    R.drawable.img_news6,
                    "isi desc"
                ),

                News(
                    "Banjir keritik ke trump yang kerahkan militer usai demo george floyd",
                    "detikcom | 6 jam yang lalu",
                    R.drawable.img_news7,
                    "isi desc"
                ),

                News(
                    "Mengapa aksi demo damai kasus george floyd bisa berubah jadi kerusuhan?",
                    "detikcom | 8 jam yang lalu",
                    R.drawable.img_news8,
                    "isi desc"
                ),

                News(
                    "2 opsi bagi calon jemaah haji yang tidak jadi berangkat tahun ini",
                    "detikcom | 1 menit yang lalu",
                    R.drawable.img_news9,
                    "isi desc"
                )

            ),
            listOf(
                News(
                    "Facebook Hapus Grup Anti Masker dengan 9.600 Anggota",
                    "detikcom | 3 jam yang lalu",
                    R.drawable.teknologi1,
                    "Jakarta - Selain kelompok anti vaksin, kelompok anti masker juga bikin ulah dan membuat penanganan pandemi virus Corona menjadi semakin susah. Facebook pun harus bersih-bersih grup anti masker"
                ),

                News(
                    "Video Pendaratan Pertama di Bulan Dipoles Lagi Pakai AI",
                    "detikcom | 1 Jam yang lalu",
                    R.drawable.teknologi2,
                    "Jakarta - Video pendaratan pertama di Bulan yang dilakukan misi Apollo 11 memukau banyak orang. Meski demikian, harus diakui kualitas gambar dan video untuk mengabadikan momen tersebut belum bagus. Video ini kemudian dipercantik dengan teknologi kecerdasan buatan (artificial intelligence/AI)."
                ),

                News(
                    "AS Tuntut Hacker China yang Coba Curi Data Vaksin Virus Corona",
                    "detikcom | 2 jam yang lalu",
                    R.drawable.teknologi3,
                    "Jakarta - Kementerian Kehakiman Amerika Serikat menuntut dua hacker warga negara China yang dituding meretas sistem komputer milik perusahaan yang meneliti vaksin virus Corona. Keduanya juga didakwa atas beberapa tuduhan kejahatan siber lainnya."
                ),

                News(
                    "Vivo: X50 Series Dapat Sambutan Positif dari Berbagai Pihak",
                    "detikcom | 3 jam yang lalu",
                    R.drawable.teknologi4,
                    "isi desc"
                )


            ),
            listOf(
                News(
                    "Facebook Hapus Grup Anti Masker dengan 9.600 Anggota",
                    "detikcom | 3 jam yang lalu",
                    R.drawable.teknologi1,
                    "Jakarta - Selain kelompok anti vaksin, kelompok anti masker juga bikin ulah dan membuat penanganan pandemi virus Corona menjadi semakin susah. Facebook pun harus bersih-bersih grup anti masker"
                ),

                News(
                    "Video Pendaratan Pertama di Bulan Dipoles Lagi Pakai AI",
                    "detikcom | 1 Jam yang lalu",
                    R.drawable.teknologi2,
                    "Jakarta - Video pendaratan pertama di Bulan yang dilakukan misi Apollo 11 memukau banyak orang. Meski demikian, harus diakui kualitas gambar dan video untuk mengabadikan momen tersebut belum bagus. Video ini kemudian dipercantik dengan teknologi kecerdasan buatan (artificial intelligence/AI)."
                ),

                News(
                    "AS Tuntut Hacker China yang Coba Curi Data Vaksin Virus Corona",
                    "detikcom | 2 jam yang lalu",
                    R.drawable.teknologi3,
                    "Jakarta - Kementerian Kehakiman Amerika Serikat menuntut dua hacker warga negara China yang dituding meretas sistem komputer milik perusahaan yang meneliti vaksin virus Corona. Keduanya juga didakwa atas beberapa tuduhan kejahatan siber lainnya."
                ),

                News(
                    "Vivo: X50 Series Dapat Sambutan Positif dari Berbagai Pihak",
                    "detikcom | 3 jam yang lalu",
                    R.drawable.teknologi4,
                    "isi desc"
                )


            )
        )


    }
}