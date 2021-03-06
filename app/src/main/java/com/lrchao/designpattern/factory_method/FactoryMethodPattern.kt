package com.lrchao.designpattern.factory_method

/**
 * Description: TODO
 * @author lrc19860926@gmail.com
 * @date 2021/3/6 3:45 下午
 */
object FactoryMethodPattern {

    fun run () {
        val factory = ConcreteFactory1()
        val product = factory.newProduct()
        product.show()
    }
}