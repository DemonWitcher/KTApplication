package com.example.ktapplication.note

import android.util.Log

/**
 * 本篇DEMO有 构造函数 函数 静态函数 常量 类变量 接口  ？  ！！的写法
 */
/*
主体构造函数的写法
 */
class GouZaoHanShu constructor(name: String) {

    //普通类变量
    var name: String
    var age: Int = 0
    //类名后面带个?说明是可以为空的,使用的时候变量名后面加!!来调用,参考MainActivity这个类
    var onClickListener: OnClickListener? = null

    /*
    主构函数不能包含任何代码，初始化代码放在以init关键字作为前缀的初始化块中；可以有多个init，也可以没有init，init的执行顺序是根据写的顺序来的
     */
    init {
        this.name = name
    }

    /*
    次级构造函数 可以有很多 通过this调用主构造函数
     */
    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }

    //普通的函数
    fun ok(a: Int) {
    }
    //普通的函数重载
    fun ok(a: Int,name:String) {
    }

    //带返回值的函数
    fun add(a: Int, b: Int): Int {
        return a + b
    }
    //伴生对象  kt中的静态函数和常量就这么写
    companion object {
        //常量
        val MAX_AGE = 130

        //普通静态函数
        fun test(age: Int) {
        }

        //有返回值的静态函数
        fun test(age: Int, name: String): Int {
            return age
        }
    }

    //接口 和java中的接口不同  KT的接口可以有已实现函数
    interface OnClickListener {
        val A: Int//可以让子类去实现的属性
        fun onClick()
        fun test() {
            Log.i("witcher","已实现函数")
        }
    }
}