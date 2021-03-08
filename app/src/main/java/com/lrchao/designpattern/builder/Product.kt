package com.lrchao.designpattern.builder

/**
 * Description: TODO
 * @author lrc19860926@gmail.com
 * @date 2021/3/8 10:05 下午
 */
class Product {
    var partA: String? = null
    var partB: String? = null
    var partC: String? = null

    fun show() {
        println("show partA =$partA partB=$partB partC=$partC")
    }
}