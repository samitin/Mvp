package ru.samitin.mvp

import java.lang.StringBuilder

class Model {
   private val list= mutableMapOf<String,Int>()

    fun add(name:String,phone:Int )=list.put(name,phone)

    fun clear()=list.clear()

    fun getList():Map<String,Int>{
       return list

    }
}