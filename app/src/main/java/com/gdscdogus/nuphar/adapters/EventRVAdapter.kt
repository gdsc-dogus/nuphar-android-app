package com.gdscdogus.nuphar.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gdscdogus.nuphar.R
import com.gdscdogus.nuphar.databinding.RowEventBinding
import com.gdscdogus.nuphar.models.EventModel

class EventRVAdapter(var eventArrayList: ArrayList<EventModel>) :
    RecyclerView.Adapter<EventRVAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = RowEventBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_event, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return eventArrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val eventModel = eventArrayList[position]

        holder.binding.tvTitle.text = eventModel.title;
        holder.binding.tvDescription.text = eventModel.description;

        if (eventArrayList.size == position + 1)
            holder.binding.vLine.visibility = View.GONE
        else
            holder.binding.vLine.visibility = View.VISIBLE
    }
}