package com.lrchao.designpattern.proxy

import com.lrchao.designpattern.proxy.static.ProxySubject
import com.lrchao.designpattern.proxy.static.Subject
import java.lang.reflect.InvocationHandler
import java.lang.reflect.Proxy


/**
 * Description: TODO
 * @author lrc19860926@gmail.com
 * @date 2021/3/16 10:11 下午
 */
object ProxyPattern {

    fun run() {

        val staticProxy = ProxySubject()
        staticProxy.request()

        val handler = InvocationHandler { proxy, method, args ->
            println(method)
            if (method.name == "request") {
                println("dynamic request")
            }
            null
        }

        val hello: Subject = Proxy.newProxyInstance(
            Subject::class.java.classLoader, arrayOf<Class<*>>(Subject::class.java),  // 传入要实现的接口
            handler
        ) as Subject // 传入处理调用方法的InvocationHandler

        hello.request()

    }
}