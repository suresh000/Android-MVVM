package com.material.mvvm.structures.view.home

import android.view.View
import com.material.mvvm.structures.AppNavigation

class HomeRepository {

    fun loginClick(view: View) {
        val action = HomeFragmentDirections.actionHomeFragmentToLoginFragment()
        AppNavigation.navigate(view, action)
    }

    fun recyclerViewClick(view: View) {
        val action = HomeFragmentDirections.actionHomeFragmentToRecyclerViewFragment()
        AppNavigation.navigate(view, action)
    }

}