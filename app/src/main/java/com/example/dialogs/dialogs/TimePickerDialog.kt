package com.example.dialogs.dialogs

import android.content.Context
import android.widget.TimePicker
import android.widget.Toast

class TimePickerDialog(val context: Context) {
    fun showDialog() {
        val dialog = android.app.TimePickerDialog(
            context,
            object : android.app.TimePickerDialog.OnTimeSetListener {
                override fun onTimeSet(p0: TimePicker?, p1: Int, p2: Int) {
                    Toast.makeText(context, "$p1", Toast.LENGTH_SHORT).show()
                }
            },
            15,
            50,
            true
        )
        dialog.show()
    }
}