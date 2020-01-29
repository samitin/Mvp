package ru.samitin.mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

   val presenter:Presenter= Presenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickAdd(v:View){

        if(name.text.toString().length>1&&phone.text.toString().length>1) {
            presenter.add(name.text.toString(), phone.text.toString().toInt())
            text.setText(presenter.getText())
            Toast.makeText(this,"Контакт добавлен",Toast.LENGTH_SHORT).show()
        }
    }
    fun onClickClear(v:View){

        presenter.clear()
        text.setText(presenter.getText())
        Toast.makeText(this,"Список очищен",Toast.LENGTH_SHORT).show()
    }
}
