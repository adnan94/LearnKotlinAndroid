package com.example.demokotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.demokotlin.R
import com.example.demokotlin.adapter.RecyclerViewAdapter
import com.example.demokotlin.databinding.ActivityRecyclerViewListBinding
import revo.adnan.com.learnkotln.Model
import java.util.ArrayList

class RecyclerViewList : AppCompatActivity() {

    private lateinit var list: ArrayList<Model>
    private lateinit var adapter: RecyclerViewAdapter
    lateinit var binding: ActivityRecyclerViewListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_recycler_view_list)
        supportActionBar!!.title = "Custom ListView"
        binding.recycler.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        listWork();
        clicks();
    }

    private fun listWork() {
        list = arrayListOf<Model>()
        adapter = RecyclerViewAdapter(list);
        binding.recycler.adapter = adapter
    }

    private fun clicks() {
        binding.add.setOnClickListener(View.OnClickListener {
            if (binding.editText.text.trim().length > 0) {
                list.add(Model(binding.editText.text.toString(), binding.editText.text.toString()))
                adapter.notifyDataSetChanged()
                binding.editText.text = null
            } else {
                Toast.makeText(this, "Enter Text", Toast.LENGTH_SHORT).show();
            }
        })
    }
}