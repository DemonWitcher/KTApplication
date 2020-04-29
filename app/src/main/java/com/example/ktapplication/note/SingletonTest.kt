package com.example.ktapplication.note

//双判断加锁模式
class SingletonTest private constructor() {
    companion object {
        val instance: SingletonTest by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            SingletonTest() }
    }
}
//静态内部类模式
class SingletonDemo private constructor() {
    companion object {
        val instance = SingletonHolder.holder
    }

    private object SingletonHolder {
        val holder= SingletonDemo()
    }

}