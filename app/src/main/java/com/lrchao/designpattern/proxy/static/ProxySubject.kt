package com.lrchao.designpattern.proxy.static

/**
 * Description: TODO
 * @author lrc19860926@gmail.com
 * @date 2021/3/16 10:18 下午
 */
class ProxySubject : Subject {

    private var realSubject : RealSubject? = null

    override fun request() {
        if (realSubject == null) {
            realSubject = RealSubject()
        }
        preRequest()
        realSubject?.request()
        postRequest()
    }

    private fun preRequest(){
        println("访问真实主题之前的预处理。")
    }

    private fun postRequest() {
        println("访问真实主题之后的后续处理。")
    }
}