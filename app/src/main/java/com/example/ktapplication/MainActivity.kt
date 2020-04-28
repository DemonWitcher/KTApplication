package com.example.ktapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ktapplication.note.GouZaoHanShu

/**
 * 本篇有怎么new一个对象
 * 怎么调用对象的属性 包括！！的用法
 * 怎么实现一个匿名内部类
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a : Int?  = 1
        var b:Int? = 2
        if(a!=null&&b!=null){
            var c:Int = a+b
        }
        var c:Int = a!!+b!!

        //kt的new一个对象
        var han = GouZaoHanShu("y",10)
        //kt的匿名内部类
        han.onClickListener = object :GouZaoHanShu.OnClickListener{
            override val A: Int
                get() = 1

            override fun onClick() {

            }
        }
        //因为han.onClickListener是可空属性 所以需要加2个!!来调用
        han.onClickListener!!.test()
    }
}
