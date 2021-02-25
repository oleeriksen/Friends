package com.easv.oe.friends.GUI

import android.view.View
import com.easv.oe.friends.Model.BEFriend

interface IClickItemListener {

    fun onFriendClick(friend: BEFriend, position: Int);
}