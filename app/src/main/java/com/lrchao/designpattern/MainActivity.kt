package com.lrchao.designpattern

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.lrchao.designpattern.abstract_factory.AbstractFactoryPattern
import com.lrchao.designpattern.factory_method.FactoryMethodPattern
import com.lrchao.designpattern.pattern.chainofresponsibility.ChainOfResponsibilityPattern
import com.lrchao.designpattern.prototype.PrototypePattern
import com.lrchao.designpattern.simplefactory.SampleFactoryPattern
import com.lrchao.designpattern.singleton.SingletonPattern
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
                        0 -> SingletonPattern.run()
                        1 -> PrototypePattern.run()
                        2 -> SampleFactoryPattern.run()
                        3 -> FactoryMethodPattern.run()
                        4 -> AbstractFactoryPattern.run()
                        //2 -> ChainOfResponsibilityPattern.run()
                }
            }

        }
        recyclerView.adapter = adapter

    }
}
