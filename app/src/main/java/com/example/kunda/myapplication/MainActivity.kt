package com.example.kunda.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.input.input

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    public fun messageDialogBox(view : View) {
        MaterialDialog(this)
            .title(text = "Random title")
            .message(text = " Random sequence of letters")
            .positiveButton(text = "Ok")
            .negativeButton(text = "Cancel")
            .show()
    }

    public fun editTextDialogBox(view : View) {
        MaterialDialog(this)
            .title(text = "Give the location a name")
            .input(hint = "My location") { materialDialog, charSequence ->
                Toast.makeText(baseContext,charSequence,Toast.LENGTH_SHORT).show()
            }
            .positiveButton(text = "Submit")
            .negativeButton(text = "Cancel")
            .show()
    }
}
