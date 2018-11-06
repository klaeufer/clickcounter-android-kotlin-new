package edu.luc.cs.clickcounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.properties.Delegates


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var counter: Int by Delegates.observable(0) {
        prop, old, new ->
        textView.text = new.toString()
    }

    fun onIncrement(view: View) {
        counter += 1
    }

    fun onDecrement(view: View) {
        if (counter > 0) counter -= 1
    }

    fun onReset(view: View) {
        counter = 0
    }
}
