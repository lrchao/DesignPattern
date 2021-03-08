package com.lrchao.designpattern.builder

/**
 * Description: TODO
 * @author lrc19860926@gmail.com
 * @date 2021/3/8 10:07 下午
 */
class ConcreteBuilder : Builder() {
    override fun buildPartA() {
        product.partA = "建造 PartA"
    }

    override fun buildPartB() {
        product.partB = "建造 PartB"
    }

    override fun buildPartC() {
        product.partC = "建造 PartC"
    }
}