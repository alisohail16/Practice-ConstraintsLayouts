package com.example.practiceconstraintslayout.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.practiceconstraintslayout.R
import com.example.practiceconstraintslayout.databinding.MoreCategoryLayoutBinding

class MoreCategoryAdapter(var context: Context) :
    RecyclerView.Adapter<MoreCategoryAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.more_category_layout, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {

        }
    }

    override fun getItemCount(): Int {
        return 8
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val binding = MoreCategoryLayoutBinding.bind(view)
    }
}