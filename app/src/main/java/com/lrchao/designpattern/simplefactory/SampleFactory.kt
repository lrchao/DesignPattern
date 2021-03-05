package com.lrchao.designpattern.simplefactory

/**
 * Description:
 * @author lrc19860926@gmail.com
 * @date 2021/3/5 10:18 上午
 */
object SampleFactory {

    fun makeProduct(kind: Int): Product {
        return when(kind) {
            PRODUCT_A -> ProductA()
            PRODUCT_B -> ProductB()
            else -> ProductA()
        }
    }
    const val PRODUCT_A = 1
    const val PRODUCT_B = 2
}