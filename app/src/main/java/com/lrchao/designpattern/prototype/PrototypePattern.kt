package com.lrchao.designpattern.prototype

import android.util.Log

/**
 * Description: 原型模式
 * @author lrc19860926@gmail.com
 * @date 2019-12-06 11:26
 */
object PrototypePattern {

    const val TAG : String = "PrototypePattern"

    fun run() {

        val obj1 = Realizetype()
        val obj2 = obj1.clone()
        Log.e(TAG, "obj1==obj2? ${obj1 == obj2}")

    }
}