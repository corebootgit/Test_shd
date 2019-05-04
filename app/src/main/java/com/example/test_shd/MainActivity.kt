package com.example.test_shd

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

var btn_state : Boolean = false

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            when (btn_state) {
                false -> chbtntext(button, getString(R.string.btn_clicked))
                true -> button.text = getString(R.string.btn_unclicked)

            }

            btn_state = !btn_state

        }
    }

    private fun chbtntext (btn: Button, txt: String) {
        btn.text = txt
    }


}