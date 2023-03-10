package com.example.dialogs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Toast
import com.example.dialogs.databinding.ActivityMainBinding
import com.example.dialogs.databinding.ItemBinding
import com.example.dialogs.dialogs.AlertDialog
import com.example.dialogs.dialogs.DatePikerDialog
import com.example.dialogs.dialogs.Snakbar
import com.example.dialogs.dialogs.TimePickerDialog
import com.example.dialogs.fragments.FragmentDialog
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentDialog = FragmentDialog()

        binding.btnAlert.setOnClickListener {
            AlertDialog(this).showDialog()
        }
        binding.btnFragment.setOnClickListener {
            fragmentDialog.show(supportFragmentManager, fragmentDialog.toString())
        }
        binding.btnCustom.setOnClickListener {
            val dialog = androidx.appcompat.app.AlertDialog.Builder(this).create()
            val itemBinding = ItemBinding.inflate(layoutInflater)

            dialog.setCancelable(false)

            itemBinding.btnYes.setOnClickListener {
                Toast.makeText(this, "Ha", Toast.LENGTH_SHORT).show()
                dialog.cancel()
            }
            itemBinding.btnNo.setOnClickListener {
                Toast.makeText(this, "Yo'q", Toast.LENGTH_SHORT).show()
                dialog.cancel()
            }
            dialog.setView(itemBinding.root)
            dialog.show()
        }
        binding.btnTimePicker.setOnClickListener {
            TimePickerDialog(this).showDialog()
        }
        binding.btnDatePicker.setOnClickListener {
            DatePikerDialog(this).showDialog()
        }
        binding.btnSnackbar.setOnClickListener {
            Snakbar(this, binding.root).showDialog()
        }
        binding.btnBottomSheet.setOnClickListener {
            val dialog = BottomSheetDialog(this)
            val itemBinding = ItemBinding.inflate(layoutInflater)
            dialog.setContentView(itemBinding.root)
            dialog.show()
        }
    }
}