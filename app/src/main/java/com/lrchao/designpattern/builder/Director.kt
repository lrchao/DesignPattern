package com.lrchao.designpattern.builder

/**
 * Description: TODO
 * @author lrc19860926@gmail.com
 * @date 2021/3/8 10:09 下午
 */
class Director(val builder: Builder) {


    //产品构建与组装方法
    fun construct(): Product? {
        builder.buildPartA()
        builder.buildPartB()
        builder.buildPartC()
        return builder.getResult()
    }
}