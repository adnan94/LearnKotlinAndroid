package revo.adnan.com.learnkotln

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.viewpager.widget.ViewPager
import com.example.demokotlin.R
import com.example.demokotlin.activity.ParentActivity
import com.example.demokotlin.adapter.TabLayoutAdapter
import com.example.demokotlin.databinding.ActivityBottomNavigationBinding
import com.example.demokotlin.databinding.ActivitySimpleListView2Binding
import com.example.demokotlin.databinding.TabLayoutActivityBinding
import com.google.android.material.tabs.TabLayout
import java.util.ArrayList

class BottomNavigationLayoutActivity : ParentActivity()  {

    lateinit var binding: ActivityBottomNavigationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_bottom_navigation)
        supportActionBar!!.title = "Bottom Navigation Layout"
        bottomNavigationWork();

    }

    private fun bottomNavigationWork() {

    }


}
