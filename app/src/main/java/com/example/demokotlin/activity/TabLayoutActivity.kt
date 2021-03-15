package revo.adnan.com.learnkotln

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.viewpager.widget.ViewPager
import com.example.demokotlin.R
import com.example.demokotlin.adapter.TabLayoutAdapter
import com.example.demokotlin.databinding.ActivitySimpleListView2Binding
import com.example.demokotlin.databinding.TabLayoutActivityBinding
import com.google.android.material.tabs.TabLayout
import java.util.ArrayList

class TabLayoutActivity : AppCompatActivity() {

    lateinit var binding: TabLayoutActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.tab_layout_activity)
        supportActionBar!!.title = "Tab Layout"
        tabsWork();

    }

    private fun tabsWork() {
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Home"))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Sport"))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Movie"))
        binding.tabLayout.tabGravity = TabLayout.GRAVITY_FILL

        val adapter = TabLayoutAdapter(this, supportFragmentManager, binding.tabLayout.tabCount)
        binding.viewPager.adapter = adapter

        binding.viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(binding.tabLayout))

        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                binding.viewPager.currentItem = tab.position
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {

            }
            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })
    }


}
