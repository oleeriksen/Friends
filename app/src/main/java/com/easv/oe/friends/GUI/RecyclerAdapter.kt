package com.easv.oe.friends.GUI

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.easv.oe.friends.Model.Friends
import com.easv.oe.friends.R


class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.FriendHolder>  {

    private val mDataset: Friends
    private val mInflater: LayoutInflater

    class FriendHolder : RecyclerView.ViewHolder {

        private var view: View
        var mName: TextView
        var mPhone: TextView
        var mFavorite: ImageView



        constructor(v: View) : super(v) {
            view = v
            mName = v.findViewById(R.id.tvNameExt)
            mPhone = v.findViewById(R.id.tvPhoneExt)
            mFavorite = v.findViewById(R.id.imgFavoriteExt)
        }

    }

    constructor(context: Context, friends: Friends):super() {
        mInflater = LayoutInflater.from(context)
        mDataset = friends


    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendHolder {
        val view: View = mInflater.inflate(R.layout.cell_extended, parent,false)
        return FriendHolder(view)
    }

    override fun onBindViewHolder(holder: FriendHolder, position: Int) {
        val f = mDataset.getAll()[position]
        holder.mName.text = f.name
        holder.mPhone.text = f.phone
        holder.mFavorite.setImageResource(if (f.isFavorite) R.drawable.ok else R.drawable.notok)
    }

    override fun getItemCount(): Int {
        return mDataset.getAll().size
    }

}
