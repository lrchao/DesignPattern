package com.lrchao.designpattern.singleton

/**
 * Description:
 * @author lrc19860926@gmail.com
 * @date 2019-12-10 17:17
 */
object SingletonPattern {

    fun run () {
        HungrySingletonJava.getInstance()
        HungrySingletonJava.getInstance()

        HungrySingletonKt.getInstance()
        HungrySingletonKt.getInstance()

    }
}