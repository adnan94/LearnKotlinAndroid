package revo.adnan.com.learnkotln

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlin.adnan.com.learnkotln.R

class SimpleListView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_list_view2)
        supportActionBar!!.title = "Simple ListView"

        var listView = findViewById(R.id.listView) as ListView
        var addd = findViewById(R.id.add) as Button
        var editText = findViewById(R.id.editText) as EditText
        val msg: String = editText.text.toString()
        val list = arrayListOf<String>()

        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        listView.adapter = adapter

        addd.setOnClickListener(View.OnClickListener {
            if (editText.text.trim().length > 0) {
                list.add(editText.text.toString())
                adapter.notifyDataSetChanged()
                editText.text=null
            }else {
                Toast.makeText(this, "Enter Text", Toast.LENGTH_SHORT).show();
            }
        })

    }
}
