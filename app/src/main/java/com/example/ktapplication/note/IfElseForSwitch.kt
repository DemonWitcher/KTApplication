package com.example.ktapplication.note

import android.util.Log

/**
 * kt中对应的java关键字
 * 本篇讲了if else ,switch case,for ,while,break,continue的用法
 */
class IfElseForSwitch {
    fun ifelse(){
        //if else和java没啥区别
        var a:Int = 10
        if(a<100){

        }else if(a>100){

        }else{

        }
    }
    fun switchCase(){
        //KT中没有switch 和case关键字 用的是when来代替 差不多
        var a:Int = 10
        when(a){
            1 -> Log.i("witcher","1")
            2 -> Log.i("witcher","2")
            in 15..20 -> Log.i("witcher","15-20")
            else -> Log.i("witcher","else dft")
        }
        var str :String = "a"
        when(str){
            "b" ->  Log.i("witcher","str b")
            "a" ->  Log.i("witcher","str a")
            is String -> Log.i("witcher","is String")
            else -> Log.i("witcher","else dft")
        }

    }
    fun forContinue(){
        //FOR循环遍历0-99
        for(index in 0..99){
            Log.i("witcher",""+index)
            if(index == 10){
                continue
            }else if(index == 88){
                break
            }
        }
        //倒叙遍历
        for (index in 99 downTo 0){
            Log.i("witcher",""+index)
        }
        for (index in 0..99 step 2){ //step为增长条件
            Log.i("witcher",""+index)//会输出2..4..6......
        }
        for (index in 0 until 100){ //不包含末尾
            Log.i("witcher",""+index)//输出0到99
        }
        //遍历一个集合
        val list :ArrayList<Int> = ArrayList()
        list.add(1)
        list.add(2)
        list.add(3)
        //同时拿到下标和元素
        for ((index,e) in list.withIndex()){
            Log.i("witcher","下标=$index----元素=$e")
        }
        //只拿元素
        for (element in list){
            Log.i("witcher","element=$element")
        }
        //只拿下标
        for (index in list.indices){
            Log.i("witcher","index=$index")//输出0，1，2
        }
    }
    fun whileBreak(){
        //和java差不多 放一个条件进去
        while(true){
            Log.i("witcher","ok")
        }
    }

}