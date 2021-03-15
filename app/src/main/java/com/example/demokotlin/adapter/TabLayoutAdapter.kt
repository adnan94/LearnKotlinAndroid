package com.example.demokotlin.adapter

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.demokotlin.fragments.SportsFragment

class TabLayoutAdapter (private val myContext: Context, fm: FragmentManager, internal var totalTabs: Int) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> {
                var homeFragment:SportsFragment = SportsFragment()
                var bundle:Bundle = Bundle()
                bundle.putString("title","Home")
                homeFragment.arguments = bundle
                return homeFragment
            }
            1 -> {
                var sportFragment:SportsFragment = SportsFragment()
                var bundle:Bundle = Bundle()
                bundle.putString("title","Sport")
                sportFragment.arguments = bundle
                return sportFragment
            }
            2 -> {
                var movieFragment:SportsFragment = SportsFragment()
                var bundle:Bundle = Bundle()
                bundle.putString("title","Movie")
                movieFragment.arguments = bundle
                return movieFragment
            }else -> return SportsFragment()
        }
    }

    // this is for fragment tabs


    override fun getCount(): Int {
        return totalTabs
    }
}