package com.nearueki.pahamcovid19

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.nearueki.pahamcovid19.databinding.ActivityMenuutamaBinding

class MenuUtama : AppCompatActivity() {
private lateinit var binding:com.nearueki.pahamcovid19.databinding.ActivityMenuutamaBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()
        setContentView(R.layout.activity_menuutama)
        binding = ActivityMenuutamaBinding.inflate(this.layoutInflater)

    }

    fun videoapaitu(view: View) {
        val intent = Intent(this, VideoPlayerActivity::class.java)
        intent.putExtra("idvideo", "S9m66TZ3QSM")
        startActivity(intent)
    }

    fun videobahaya(view: View) {
        val intent = Intent(this, VideoPlayerActivity::class.java)
        intent.putExtra("idvideo", "6cuJCWxfSBU")
        startActivity(intent)
    }

    fun videoadaptasi(view: View) {
        val intent = Intent(this, VideoPlayerActivity::class.java)
        intent.putExtra("idvideo", "cYRD69Td6B0")
        startActivity(intent)
    }
    fun videolarangan(view: View) {
        val intent = Intent(this, VideoPlayerActivity::class.java)
        intent.putExtra("idvideo", "N3iw1_2sPlA")
        startActivity(intent)
    }
}