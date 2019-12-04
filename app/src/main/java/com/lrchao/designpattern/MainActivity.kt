package com.lrchao.designpattern

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.lrchao.designpattern.pattern.chainofresponsibility.ChainOfResponsibilityPattern
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = ItemAdapter()
        adapter.addData(resources.getStringArray(R.array.pattern_list).toMutableList())

        adapter.onItemClickListener = object : ItemAdapter.OnItemClickListener{
            override fun onItemClick(position: Int) {
                when(position){
                        0 -> ChainOfResponsibilityPattern.run()
                }
            }

        }
        recyclerView.adapter = adapter

    }
}
