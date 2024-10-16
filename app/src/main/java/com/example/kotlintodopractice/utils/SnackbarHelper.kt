package com.example.kotlintodopractice.utils


import android.graphics.Color
import android.view.View
import androidx.annotation.ColorInt
import com.google.android.material.snackbar.Snackbar

class SnackbarHelper {

    fun displayDefaultSnackbar(
        parentView: View,
        message: String,
        @ColorInt textColor: Int = Color.WHITE,
        actionText: String? = null,
        action: (() -> Unit)? = null
    ) {

        val snackbar = Snackbar.make(parentView, message, Snackbar.LENGTH_LONG)

        snackbar.setTextColor(textColor)
        snackbar.setActionTextColor(Color.RED)


        if (actionText != null && action != null) {
            snackbar.setAction(actionText) {
                action()
            }
        }

        snackbar.show()
    }
}