package com.example.hackathonuiex.ui.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.hackathonuiex.R

class FilterFragment:Fragment(R.layout.fragment_filter){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setPointer()
    }

    private fun setPointer() {
        //save to viewModel the filter properties
    }
}