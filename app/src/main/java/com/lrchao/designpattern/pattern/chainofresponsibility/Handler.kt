package com.lrchao.designpattern.pattern.chainofresponsibility

/**
 * Description:
 * @author lrc19860926@gmail.com
 * @date 2019-12-04 17:00
 */
abstract class Handler(val name: String) {
    var nextHandler // 下一个处理者
            : Handler? = null

    abstract fun process(leaveRequest: LeaveRequest): Boolean
}