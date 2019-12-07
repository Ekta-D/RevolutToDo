package com.revolut.ui.adapter

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.revolut.R
import com.revolut.ui.views.rates.fragment.ConverterFragment

/**
 *
 * FragmentPagerAdapter implementation to display the main fragments
 */
class ConverterTabFragmentAdapter(val context: Context, fm: FragmentManager) : FragmentPagerAdapter(fm) {

    companion object {
        const val TabConverter = 0
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            TabConverter -> ConverterFragment()
            else -> error(
                "there is no type that matches the position $position + make sure your using adapter correctly")
        }
    }

    override fun getCount(): Int {
        return 1
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            TabConverter -> context.getString(R.string.title_converter)
            else -> ""
        }
    }

}