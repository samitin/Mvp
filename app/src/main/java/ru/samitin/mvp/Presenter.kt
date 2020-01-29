package ru.samitin.mvp

import android.content.Context
import android.widget.EditText
import android.widget.TextView

class Presenter{
    val model:Model= Model()

    private var text:String="Список пуст!"
    fun getText():String {
        text=""
        for ((name,phone)in model.getList())
            text+="$name $phone \n"
        return text
    }
    fun add(name:String,phone:Int){
        model.add(name,phone)


    }

    fun clear(){
        model.clear()
        text="Список пуст"
    }


}