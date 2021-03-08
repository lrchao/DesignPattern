package com.lrchao.designpattern.builder

/**
 * Description: TODO
 * @author lrc19860926@gmail.com
 * @date 2021/3/8 10:00 下午
 */
object BuilderPattern {

    fun run() {
        val builder = ConcreteBuilder()
        val director = Director(builder)
        val product = director.construct()
        product?.show()
    }
}