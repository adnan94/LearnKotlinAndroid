package revo.adnan.com.learnkotln

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.demokotlin.R
import com.example.demokotlin.databinding.ActivitySimpleListView2Binding
import java.util.ArrayList

class SimpleListView : AppCompatActivity() {

    private lateinit var list: ArrayList<String>
    private lateinit var adapter: ArrayAdapter<String>
    lateinit var binding: ActivitySimpleListView2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_simple_list_view2)
        supportActionBar!!.title = "Simple ListView"
        listWork();
        clicks();
    }

    private fun clicks() {
        binding.add.setOnClickListener(View.OnClickListener {
            if (binding.editText.text.trim().length > 0) {
                list.add(binding.editText.text.toString())
                adapter.notifyDataSetChanged()
                binding.editText.text = null
            } else {
                Toast.makeText(this, "Enter Text", Toast.LENGTH_SHORT).show();
            }
        })
    }

    private fun listWork() {
        list = arrayListOf<String>()
        adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        binding.listView.adapter = adapter
    }
}
