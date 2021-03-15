package com.example.demokotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.demokotlin.R
import revo.adnan.com.learnkotln.Model

class RecyclerViewAdapter (val userList: ArrayList<Model>) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.listrow, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(userList[position])
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return userList.size
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(user: Model) {
            val textViewName = itemView.findViewById(R.id.name) as TextView
            val textViewEmail  = itemView.findViewById(R.id.email) as TextView
            textViewName.text = user.name
            textViewEmail.text = user.number
        }
    }
}