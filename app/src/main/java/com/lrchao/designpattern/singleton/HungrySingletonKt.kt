package com.lrchao.designpattern.singleton

/**
 * Description: 饿汉式
 * @author lrc19860926@gmail.com
 * @date 2021/3/3 11:09 上午
 */
object HungrySingletonKt {

    init {
        println("HungrySingletonKt")
    }
    fun getInstance() {
    }
}