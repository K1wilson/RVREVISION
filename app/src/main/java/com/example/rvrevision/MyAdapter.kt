package com.example.rvrevision

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(
    private val programmingList : ArrayList <ProgrammingLanguage>
) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
   val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return  MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
val currentItem = programmingList [position]
        holder.titleimage.setImageResource(currentItem.titleImage)
        holder.heading.text = currentItem.heading

    }

    override fun getItemCount(): Int {
        return programmingList.size
    }
    class MyViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
 val titleimage : ShapeableImageView = itemView.findViewById(R.id.title_image)
        val heading : TextView = itemView.findViewById(R.id.tvheading)
    }

}