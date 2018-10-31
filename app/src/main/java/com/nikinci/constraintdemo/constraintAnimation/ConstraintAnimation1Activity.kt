package com.nikinci.constraintdemo.constraintAnimation

import android.content.Context
import android.content.Intent
import com.nikinci.constraintdemo.BaseConstraintLayoutActivity
import com.nikinci.constraintdemo.R


/**
 * Created by nikinci on 2018-10-31.
 */

class ConstraintAnimation1Activity : BaseConstraintLayoutActivity() {

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, ConstraintAnimation1Activity::class.java).apply {

            }
        }
    }

    override fun getEndConstraintSet(): Int {
        return R.layout.constraint_animation_2_end
    }

    override fun getStartConstraintSet(): Int {
        return R.layout.constraint_animation_2_start
    }


}
