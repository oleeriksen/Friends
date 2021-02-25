package com.easv.oe.friends.GUI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.easv.oe.friends.Model.Friends
import com.easv.oe.friends.R
import kotlinx.android.synthetic.main.activity_recycler.*

class RecyclerActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)


        val mReView = findViewById<RecyclerView>(R.id.recyclerView)

        mReView.layoutManager = LinearLayoutManager(this)

        mReView.adapter = RecyclerAdapter(this, Friends())

    }
}