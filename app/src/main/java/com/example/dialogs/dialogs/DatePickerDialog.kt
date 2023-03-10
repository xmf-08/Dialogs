package com.example.dialogs.dialogs

import android.app.DatePickerDialog
import android.content.Context
import android.widget.DatePicker
import android.widget.Toast

class DatePikerDialog(val context: Context) {
    fun showDialog(){
        val datePickerDialog = DatePickerDialog(context, object : DatePickerDialog.OnDateSetListener{
            override fun onDateSet(p0: DatePicker?, p1: Int, p2: Int, p3: Int) {
                Toast.makeText(context, "$p1/$p2/$p3", Toast.LENGTH_SHORT).show()
            }
        },2022, 11, 22 )
            .show()
    }
}