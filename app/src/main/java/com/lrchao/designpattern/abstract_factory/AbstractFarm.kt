package com.lrchao.designpattern.abstract_factory

/**
 * Description: TODO
 * @author lrc19860926@gmail.com
 * @date 2021/3/6 10:07 下午
 */
interface AbstractFarm {

    fun newAnimal(): Animal

    fun newPlant(): Plant
}