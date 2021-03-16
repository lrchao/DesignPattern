package com.lrchao.designpattern.proxy.static

/**
 * Description: TODO
 * @author lrc19860926@gmail.com
 * @date 2021/3/16 10:17 下午
 */
class RealSubject : Subject {
    override fun request() {
        println("访问真实主题方法...")
    }
}