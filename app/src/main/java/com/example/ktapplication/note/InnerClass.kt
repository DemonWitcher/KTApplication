package com.example.ktapplication.note

import android.util.Log

/**
 * 内部类的使用
 */
class InnerClass {

    val testVal:String = "test"
    //内部类的写法
    inner class Inner{
        fun test(){
            Log.i("wi", "testVal:$testVal")
        }
    }

    //静态内部类  默认就是 java的 public static
    class StaticInnerClass{
            fun test(){
                Log.i("w","静态内部类")
            }
    }


}