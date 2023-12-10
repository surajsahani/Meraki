package com.androidhacks.meraki

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.androidhacks.meraki.databinding.ItemCourseBinding
import com.androidhacks.meraki.models.Pathway
import com.bumptech.glide.Glide

class MainAdapter(private val pathways: List<Pathway>,
                  private val onPathwayClick : (Pathway) -> Unit) : RecyclerView.Adapter<MainAdapter.MyVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyVH {
        val view = ItemCourseBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyVH(view)
    }


    override fun onBindViewHolder(holder: MyVH, position: Int) {
        holder.bind(pathways[position])
    }

    override fun getItemCount(): Int {
        return pathways.size
    }

    inner class MyVH(val binding: ItemCourseBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Pathway) {
            Glide.with(binding.root.context)
                .load(item.logo)
                .into(binding.courseLogo)

            binding.courseName.text = item.name

            binding.root.setOnClickListener {
                onPathwayClick(item)
            }
        }
    }
}