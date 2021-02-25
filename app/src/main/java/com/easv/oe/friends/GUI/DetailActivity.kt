package com.easv.oe.friends.GUI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.easv.oe.friends.Model.BEFriend
import com.easv.oe.friends.R
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        if (intent.extras != null) {
            val extras: Bundle = intent.extras!!
            /*val name = extras.getString("name")
            val phone = extras.getString("phone")
            val favorite = extras.getBoolean("favorite")*/
            val friend = extras.getSerializable("friend") as BEFriend
            tvName.text = friend.name
            tvPhone.text = friend.phone
            imgFavorite.setImageResource(if (friend.isFavorite) R.drawable.ok else R.drawable.notok)
        }
        else
        {
            Log.d("xyz", "system error: intent.extras for detailactivity is null!!!!")
        }
    }

    fun onClickBack(view: View) { finish() }
}