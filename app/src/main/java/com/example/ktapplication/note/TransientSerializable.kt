package com.example.ktapplication.note

import java.io.Serializable

/**
 * transient瞬态关键字和序列化
 * kt没有transient关键字,用@Transient注解来替代
 */
class TransientSerializable :Serializable{

    @Transient
    var  int:Int = 1
}