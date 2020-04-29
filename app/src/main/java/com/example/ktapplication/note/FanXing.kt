package com.example.ktapplication.note

/**
 * 关于kt对泛型支持的测试
 * 和java差不多 可以直接用T,也可以直接用T继承自某个类
 * 也可以用逗号隔开使用多个泛型
 */

class FanXing <t : SuperClass,d> {


    fun test(list:ArrayList<t>){

    }

    fun test2(list:ArrayList<t>):t{
        return list[0]
    }

}