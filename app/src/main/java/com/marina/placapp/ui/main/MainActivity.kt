package com.marina.placapp.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marina.placapp.R
import com.marina.placapp.ui.game.GameActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btNewGame.setOnClickListener {
            val nextScreen = Intent(this, GameActivity::class.java)
            startActivity(nextScreen)
        }

        btExit.setOnClickListener {
            finish()
        }
    }
}
