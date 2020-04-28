package com.example.ktapplication.note

/**
本篇讲了怎么写一个父类 base类
 和java的差别主要在于open这个关键字
 */
open class SuperClass {
    open fun add(a:Int, b:Int):Int{
        return a+b
    }

}