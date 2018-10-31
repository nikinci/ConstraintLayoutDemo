package com.nikinci.constraintdemo.constraintAnimation

import android.content.Context
import android.content.Intent
import android.view.animation.BounceInterpolator
import androidx.transition.ChangeBounds
import com.nikinci.constraintdemo.BaseConstraintLayoutActivity
import com.nikinci.constraintdemo.R

/**
 * Created by nikinci on 2018-10-31.
 */

class ConstraintAnimation2Activity : BaseConstraintLayoutActivity() {


    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, ConstraintAnimation2Activity::class.java).apply {

            }
        }
    }

    override fun getEndConstraintSet(): Int {
        return R.layout.constraint_animation_1_end
    }

    override fun getStartConstraintSet(): Int {
        return R.layout.constraint_animation_1_start
    }

    override fun getTransition(): ChangeBounds {
        val transition = ChangeBounds()
        transition.interpolator = BounceInterpolator()
        transition.duration = 1200
        return transition
    }


}
