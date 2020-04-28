package com.example.ktapplication.note
/**
 * 这一篇将基础类型
 * int long  boolean  等等
 * 以及数组
 * 以及String
 * 类型转换
 * */
class IntBooleanString {

    fun test(){
        //基本类型
        var i :Int = 1
        var b :Byte = 1
        var s:Short = 1
        var long :Long = 1L
        var f:Float = 0.5f
        var d:Double = 0.5
        var bool:Boolean = true
        var ch:Char = '1'
        //字符串 String
        var str:String = "abc"

        //数组
        //[1,2,3]
        val arr1 = arrayOf(1, 2, 3)
        //[0,2,4]
        val arr2 = Array(3) { i -> (i * 2) }
        //读取数组内容
        var arrInt :Int =  arr1[0]

        //类型转换
        var s1 = i.toString()
        var i1 = s1.toInt()

    }

}