package com.nikinci.constraintdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nikinci.constraintdemo.constraintAnimation.ConstraintAnimation1Activity
import com.nikinci.constraintdemo.constraintAnimation.ConstraintAnimation2Activity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by nikinci on 2018-10-31.
 */

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonConstraintanimation1.setOnClickListener {
            startActivity(ConstraintAnimation1Activity.newIntent(this))
        }

        buttonConstraintanimation2.setOnClickListener {
            startActivity(ConstraintAnimation2Activity.newIntent(this))
        }

    }

}
