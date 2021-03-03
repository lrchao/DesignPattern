package com.lrchao.designpattern.singleton

/**
 * Description: 懒汉式
 * @author lrc19860926@gmail.com
 * @date 2019-12-10 17:19
 */
class LazySingletonKt private constructor() {

    companion object {

        //双重校验锁式（Double Check)
        val instanceC: LazySingletonKt by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) { LazySingletonKt() }

        private var instance: LazySingletonKt? = null
            get() {
                if (field == null) {
                    field = LazySingletonKt()
                }
                return field
            }

        //单线程
        fun getA(): LazySingletonKt {
            return instance!!
        }

        // 锁方法不推荐
        @Synchronized
        fun getB(): LazySingletonKt {
            return instance!!
        }


    }
}