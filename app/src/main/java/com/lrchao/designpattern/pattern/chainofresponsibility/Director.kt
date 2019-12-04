package com.lrchao.designpattern.pattern.chainofresponsibility

import android.util.Log

/**
 * Description:
 * @author lrc19860926@gmail.com
 * @date 2019-12-04 17:03
 */
class Director(name: String) : Handler(name) {

    override fun process(leaveRequest: LeaveRequest): Boolean {
        val result = (0..10).random() > 3
        Log.e(ChainOfResponsibilityPattern.TAG, "主管<$name> " +
                "审批 <${leaveRequest.name}> 的请假申请，" +
                "请假天数： <${leaveRequest.numOfDays}> ，" +
                "审批结果：$result ")

        if (!result) {  // 不批准
            return false
        } else if (leaveRequest.numOfDays < 3) { // 批准且天数小于3，返回true
            return true
        }

        return nextHandler?.process(leaveRequest) ?: false
    }
}