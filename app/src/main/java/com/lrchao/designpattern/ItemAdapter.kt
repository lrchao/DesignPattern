package com.lrchao.designpattern

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

/**
 * Description:
 * @author lrc19860926@gmail.com
 * @date 2019-12-04 15:03
 */
class ItemAdapter : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    private val dataSource: MutableList<String> = mutableListOf()

    var onItemClickListener: OnItemClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false))
    }

    override fun getItemCount(): Int {
        return dataSource.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataSource[position]
        holder.tvName.text = item
        holder.itemView.setOnClickListener {
            onItemClickListener?.onItemClick(position)
        }
    }

    fun addData(data: MutableList<String>) {
        dataSource.addAll(data)
    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.tvName

    }

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }
}