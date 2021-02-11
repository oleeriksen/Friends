package com.easv.oe.friends.GUI

import android.app.ListActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast
import com.easv.oe.friends.Model.Friends


class MainActivity : ListActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // NO setContent because it is only a Listview

        val adapter: ListAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, Friends().getAllNames()
        )

        listAdapter = adapter
    }

    override fun onListItemClick( parent: ListView?,
        v: View?, position: Int, id: Long) {
        // position is in the list!
        // first get the name of the person clicked
        val name = Friends().getAll()[position].name
        // and a greeting
        Toast.makeText(
            this,
            "Hi $name! Have you done your homework?",
            Toast.LENGTH_LONG
        ).show()
    }

}