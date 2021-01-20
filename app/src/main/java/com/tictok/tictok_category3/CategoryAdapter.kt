package com.tictok.tictok_category3

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CategoryAdapter(private var details: List<String>) :
    RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val itemDetail: TextView = itemView.findViewById(R.id.tv_detail)

        init {
            itemView.setOnClickListener { v: View ->
                val position: Int = adapterPosition
                Toast.makeText(itemView.context, "카테고리 ${position + 1} 클릭", Toast.LENGTH_LONG).show()

//                val intent = Intent(ViewHolder(itemView),Category_Sub_Activity@class)

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.category_item_list, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return details.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemDetail.text = details[position]
    }

}