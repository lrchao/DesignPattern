package com.lrchao.designpattern.singleton;

import android.util.Log;
import android.util.LogPrinter;

import java.util.logging.Logger;

/**
 * Description: 饿汉式
 *
 * @author lrc19860926@gmail.com
 * @date 2021/3/3 11:10 上午
 */
public class HungrySingletonJava {

    private static final HungrySingletonJava instance = new HungrySingletonJava();

    private HungrySingletonJava() {
        System.out.println("HungrySingletonJava");
    }

    public static HungrySingletonJava getInstance() {
        return instance;
    }

}
