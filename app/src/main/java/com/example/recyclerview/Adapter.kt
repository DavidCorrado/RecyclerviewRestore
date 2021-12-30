package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText

import androidx.recyclerview.widget.RecyclerView


class Adapter : RecyclerView.Adapter<Adapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val contactView = inflater.inflate(R.layout.item_edit_text, parent, false)
        return ViewHolder(contactView)
    }
    // Involves populating data into the item through holder
    override fun onBindViewHolder(viewHolder: Adapter.ViewHolder, position: Int) {

    }
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var editText: EditText = itemView.findViewById(R.id.editText)
    }

    override fun getItemCount(): Int {
        return 1
    }
}