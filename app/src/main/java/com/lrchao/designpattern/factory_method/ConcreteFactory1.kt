package com.lrchao.designpattern.factory_method

/**
 * Description: TODO
 * @author lrc19860926@gmail.com
 * @date 2021/3/6 3:43 下午
 */
class ConcreteFactory1 : AbstractFactory {
    override fun newProduct(): Product {
        println("具体工厂1生成-->具体产品1...")
        return ConcreteProduct1()
    }
}