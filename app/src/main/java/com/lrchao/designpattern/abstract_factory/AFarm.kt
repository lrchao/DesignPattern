package com.lrchao.designpattern.abstract_factory

/**
 * Description: TODO
 * @author lrc19860926@gmail.com
 * @date 2021/3/6 10:10 下午
 */
class AFarm : AbstractFarm{
    override fun newAnimal(): Animal {
        return Horse()
    }

    override fun newPlant(): Plant {
        return Tree()
    }
}