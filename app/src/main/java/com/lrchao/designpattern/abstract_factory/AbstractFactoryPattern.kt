package com.lrchao.designpattern.abstract_factory

/**
 * Description: TODO
 * @author lrc19860926@gmail.com
 * @date 2021/3/6 10:07 下午
 */
object AbstractFactoryPattern {

    fun run () {

        val aFarm = AFarm()
        val aFarmAnimal = aFarm.newAnimal()
        val aFarmPlant = aFarm.newPlant()

        val bFarm = BFarm()
        val bFarmAnimal = bFarm.newAnimal()
        val bPlant = bFarm.newPlant()
    }
}