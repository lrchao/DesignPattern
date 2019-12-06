package com.lrchao.designpattern.pattern.chainofresponsibility

import android.util.Log

/**
 * Description: 责任链模式
 * https://juejin.im/post/5bd95adfe51d45607e02ecc0
 * 使用场景：
 * 1.有多个对象可以处理一个请求，哪个对象处理该请求由运行时刻自动确定。
 * 2.可动态指定一组对象处理请求，或添加新的处理者。
 * 3.在不明确指定请求处理者的情况下，向多个处理者中的一个提交请求。
 * @author lrc19860926@gmail.com
 * @date 2019-12-04 15:32
 */
object ChainOfResponsibilityPattern {

    const val TAG : String = "ChainOfResponsibility"

    fun run() {

        val zhangsan = Director("张3")
        val lisi = Manager("李4")
        val wangwu = TopManager("王5")

        zhangsan.nextHandler = lisi
        lisi.nextHandler = wangwu

        val result1 = zhangsan.process(LeaveRequest("小旋风", 1))
        Log.e(TAG, "result1=$result1")

        val result2 = zhangsan.process(LeaveRequest("小旋风", 4))
        Log.e(TAG, "result2=$result2")

    }



}