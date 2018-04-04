package revo.adnan.com.learnkotln

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlin.adnan.com.learnkotln.R

class CustomListView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_list_view)
        var listView = findViewById(R.id.listView) as ListView
        var addd = findViewById(R.id.add) as Button
        var editText = findViewById(R.id.editText) as EditText
        val msg: String = editText.text.toString()
        val list = arrayListOf<Model>()
        val adapter = Adopter(this, list);
        listView.adapter = adapter
        supportActionBar!!.title = "Custom ListView"
        addd.setOnClickListener(View.OnClickListener {
            if (editText.text.trim().length > 0) {
                list.add(Model(editText.text.toString(), editText.text.toString()))
                adapter.notifyDataSetChanged()
                editText.text = null
            } else {
                Toast.makeText(this, "Enter Text", Toast.LENGTH_SHORT).show();
            }
        })

    }
}
