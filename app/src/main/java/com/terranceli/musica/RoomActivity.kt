package com.terranceli.musica

import android.graphics.drawable.Drawable
import android.graphics.drawable.TransitionDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class RoomActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room)

        val roomCodeTextbox = findViewById<EditText>(R.id.roomCodeTextbox)
        val roomNameLabel = findViewById<TextView>(R.id.roomNameLabel)
        val nextButton = findViewById<ImageButton>(R.id.nextButton)

        roomCodeTextbox.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (s?.length == 6) {
                    // TODO: call the get room name api

                    roomNameLabel.setText("i like pie")
                    roomNameLabel.visibility = View.VISIBLE
                    nextButton.visibility = View.VISIBLE
                } else {
                    roomNameLabel.visibility = View.INVISIBLE
                    nextButton.visibility = View.GONE
                }
            }
        })
    }
}
