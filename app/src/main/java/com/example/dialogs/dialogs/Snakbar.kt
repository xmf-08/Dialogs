package com.example.dialogs.dialogs

import android.content.Context
import android.view.View
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.flow.combine

class Snakbar(val context: Context, val view: View) {
    fun showDialog(){
        Snackbar.make(view, "Welcome to Android", Snackbar.LENGTH_SHORT)
            .show()
    }
}