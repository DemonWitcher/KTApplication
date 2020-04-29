package com.example.ktapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ktapplication.note.FanXing
import com.example.ktapplication.note.GouZaoHanShu
import com.example.ktapplication.note.SubClass

/**
 * 本篇有怎么new一个对象
 * 怎么调用对象的属性 包括！！，？，？：的用法
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
        //因为han.onClickListener是可空属性,
        // 这里的？就代表了java里的if(han.onClickListener!=null)这个作用
        //如果这里是Null,就跳过这一行或者返回一个Null然后继续往下走
        han.onClickListener?.test()
        //用！！表示 如果这里是null,就抛出一个空指针异常
        han.onClickListener!!.test()

        //这里表示初始化了一个ArrayList 赋值了Null,
        var list :ArrayList<String>? = null
        //？：的作用是 ?:前面的不是Null就用前面的  前面的是null就用?:后面的
        var g :Int = list?.size?:0

        //怎么new一个有泛型限制的对象
        var fanxing : FanXing<SubClass,String> = FanXing()
    }
}
