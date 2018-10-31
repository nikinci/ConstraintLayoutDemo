package com.nikinci.constraintdemo

import android.os.Bundle
import android.os.Handler
import android.view.animation.AnticipateOvershootInterpolator
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet
import androidx.transition.ChangeBounds
import androidx.transition.TransitionManager
import kotlinx.android.synthetic.main.constraint_animation_1_start.*

/**
 * Created by nikinci on 2018-10-31.
 */

abstract class BaseConstraintLayoutActivity : AppCompatActivity() {

    private var show = false

    @LayoutRes
    abstract fun getEndConstraintSet(): Int

    @LayoutRes
    abstract fun getStartConstraintSet(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getStartConstraintSet())
        start()

    }

    private fun start() {
        Handler().postDelayed({
            if (show) {
                hideComponents()
            } else {
                showComponents()
            }
            start()
        }, 2000)
    }

    private fun showComponents() {
        show = true
        val constraintSet = ConstraintSet()
        constraintSet.clone(this, getEndConstraintSet())
        TransitionManager.beginDelayedTransition(constraintRoot, getTransition())
        constraintSet.applyTo(constraintRoot)
    }


    private fun hideComponents() {
        show = false
        val constraintSet = ConstraintSet()
        constraintSet.clone(this, getStartConstraintSet())
        TransitionManager.beginDelayedTransition(constraintRoot, getTransition())
        constraintSet.applyTo(constraintRoot)
    }

    protected open fun getTransition(): ChangeBounds {
        val transition = ChangeBounds()
        transition.interpolator = AnticipateOvershootInterpolator(1.0f)
        transition.duration = 1500
        return transition
    }
}