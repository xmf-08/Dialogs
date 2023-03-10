package com.example.dialogs.dialogs

import android.content.Context
import android.content.DialogInterface
import android.widget.Toast

class AlertDialog (val context: Context){
    fun showDialog(){
        val dialog = androidx.appcompat.app.AlertDialog.Builder(context)
        dialog.setTitle("Ogohlantirish")
        dialog.setMessage("Haqiqattanham ham ochmoqchimisiz?")

        dialog.setNeutralButton("Qaytish", object: DialogInterface.OnClickListener{
            override fun onClick(p0: DialogInterface?, p1: Int) {
                Toast.makeText(context, "Qaytish", Toast.LENGTH_SHORT).show()
            }
        })

        dialog.setPositiveButton("Roziman", object : DialogInterface.OnClickListener {
            override fun onClick(p0: DialogInterface?, p1: Int) {
                Toast.makeText(context, "Roziman", Toast.LENGTH_SHORT) .show()
            }
        })
        dialog.setNegativeButton("Roziemsman", object : DialogInterface.OnClickListener{
            override fun onClick(p0: DialogInterface?, p1: Int) {
                Toast.makeText(context, "Qarshiman", Toast.LENGTH_SHORT).show()
            }
        })
        dialog.show()
    }
}