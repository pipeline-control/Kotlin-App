package com.example.kotlinapp_research

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.row_items.view.*

class MyAdapter(val context: Context, val userList: List<MyDataItem>): RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
     var userId: TextView
     var title: TextView

     init {
         userId = itemView.userId
         title = itemView.title
     }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var itemview = LayoutInflater.from(context).inflate(R.layout.row_items,parent,false)
        return ViewHolder(itemview)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.userId.text = userList[position].id
        holder.title.text = userList[position].author
//        Glide.with(context).load(userList[position].download_url).into(image)
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}