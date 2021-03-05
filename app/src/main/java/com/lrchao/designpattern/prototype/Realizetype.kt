package com.lrchao.designpattern.prototype

import android.util.Log

/**
 * Description:
 * @author lrc19860926@gmail.com
 * @date 2019-12-06 11:31
 */
class Realizetype : Cloneable{

    init {
        Log.e(PrototypePattern.TAG, "具体原型创建成功！")
    }

    public override fun clone(): Any {
        Log.e(PrototypePattern.TAG, "具体原型复制成功！")
        return super.clone()
    }

}