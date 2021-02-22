package com.easv.oe.friends.GUI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.easv.oe.friends.R
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        if (intent.extras != null) {
            val extras: Bundle = intent.extras!!
            val name = extras.getString("name")
            val phone = extras.getString("phone")
            val favorite = extras.getBoolean("favorite")
            tvName.text = name
            tvPhone.text = phone
            imgFavorite.setImageResource(if (favorite) R.drawable.ok else R.drawable.notok)
        }
        else
        {
            Log.d("xyz", "system error: intent.extras for detailactivity is null!!!!")
        }
    }

    fun onClickBack(view: View) { finish() }
}