package com.example.ktapplication.note

/**
 * kt中的synchronized 和 volatile关键字
 * kt中没有volatile关键字,用@Volatile注解来替代
 */
class TestThread {
    @Volatile
     var int :Int = 1

    //可以用@Synchronized注解来给整个函数上锁
    //也可以用synchronized函数来给某一段代码上锁
    @Synchronized
    fun test(){
        var lock: Any = Any()

        synchronized(lock){
            //do
        }
    }
}