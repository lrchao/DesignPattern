package com.lrchao.designpattern.builder

/**
 * Description: TODO
 * @author lrc19860926@gmail.com
 * @date 2021/3/8 10:06 下午
 */
abstract class Builder {
    //创建产品对象
    protected val product = Product()
    abstract fun buildPartA()
    abstract fun buildPartB()
    abstract fun buildPartC()

    //返回产品对象
    open fun getResult(): Product? {
        return product
    }
}