package com.lrchao.designpattern.singleton;

import org.jetbrains.annotations.Contract;

/**
 * Description: 懒汉式
 *
 * @author lrc19860926@gmail.com
 * @date 2021/3/3 11:14 上午
 */
public class LazySingletonJava {

    private static volatile LazySingletonJava instance = null;

    private LazySingletonJava() {
    }

    /**
     * 适用于单线程环境（不推荐）
     */
    public static LazySingletonJava getInstanceA() {

        if (instance == null) {
            instance = new LazySingletonJava();
        }
        return instance;
    }

    /**
     * 适用于多线程环境，但效率不高（不推荐）
     */
    public static synchronized LazySingletonJava getInstanceB() {

        if (instance == null) {
            instance = new LazySingletonJava();
        }
        return instance;
    }

    /**
     * 双重检查加锁（推荐）
     */
    public static LazySingletonJava getInstanceC() {

        if (instance == null) {
            synchronized (LazySingletonJava.class) {
                if (instance == null) {
                    instance = new LazySingletonJava();
                }
            }
        }
        return instance;
    }


}
