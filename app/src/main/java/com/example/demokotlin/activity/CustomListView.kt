package revo.adnan.com.learnkotln

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.demokotlin.R
import com.example.demokotlin.databinding.ActivityCustomListViewBinding
import java.util.ArrayList

class CustomListView : AppCompatActivity() {

    private lateinit var adapter: CustomListviewAdopter
    private lateinit var list: ArrayList<Model>
    lateinit var binding: ActivityCustomListViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_custom_list_view)
        supportActionBar!!.title = "Custom ListView"
        listWork();
        clicks();

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

    private fun listWork() {
        list = arrayListOf<Model>()
        adapter = CustomListviewAdopter(this, list);
        binding.listView.adapter = adapter
    }
}
