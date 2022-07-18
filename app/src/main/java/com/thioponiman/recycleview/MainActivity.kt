package com.thioponiman.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.thioponiman.recycleview.adapter.AdapterBuah
import com.thioponiman.recycleview.databinding.ActivityMainBinding
import com.thioponiman.recycleview.model.Buah

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listBuah = ArrayList<Buah>()
        listBuah.add(Buah("anggur",R.drawable.anggur,"10gram", "ungu atau hijau", "ungu atau hijau"))
        listBuah.add(Buah("jeruk",R.drawable.jeruk,"200gram", "orange", "orange"))
        listBuah.add(Buah("alpukat",R.drawable.alpukat,"200gram", "hijau", "ungu atau hijau"))
        listBuah.add(Buah("apel",R.drawable.apel,"300gram", "putih", "merah"))
        listBuah.add(Buah("mangga",R.drawable.mangga,"400gram", "orange", "hijau"))
        listBuah.add(Buah("melon",R.drawable.melon,"3kg", "hijau", "hijau"))
        listBuah.add(Buah("pisang",R.drawable.pisang,"200gram", "kuning", "kuning"))
        listBuah.add(Buah("salak",R.drawable.salak,"50gram", "putih", "coklat"))
        listBuah.add(Buah("semangka",R.drawable.semangka,"3kg", "merah", "hijau"))
        listBuah.add(Buah("strawbery",R.drawable.strawbery,"10gram", "merah", "merah"))

        binding.list.adapter = AdapterBuah(this,listBuah,object : AdapterBuah.OnClickListener {
            override fun detailData(item: Buah) {
                TODO("Not yet implemented")
            }

        })
    }
}