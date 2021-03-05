package com.lrchao.designpattern.simplefactory

/**
 * Description:
 * @author lrc19860926@gmail.com
 * @date 2021/3/5 10:07 上午
 */
object SampleFactoryPattern {

    fun run () {
        val product = SampleFactory.makeProduct(SampleFactory.PRODUCT_B)
        product.show()
    }
}