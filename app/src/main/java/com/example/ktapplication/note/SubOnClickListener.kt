package com.example.ktapplication.note

/**
 * 这个类主要讲一个普通的类怎么实现一个接口,怎么继承另外一个类
 */
//这里同时继承了抽象类Abstract和实现了接口GouZaoHanShu.OnClickListener
class SubOnClickListener :GouZaoHanShu.OnClickListener, Abstract(){
    //这是一个继承自抽象类的函数
    override fun ok(a: Int) {
    }

    //这是实现接口的属性
    override val A: Int
        get() = 1
    //这是实现接口的函数
    override fun onClick() {

    }
}