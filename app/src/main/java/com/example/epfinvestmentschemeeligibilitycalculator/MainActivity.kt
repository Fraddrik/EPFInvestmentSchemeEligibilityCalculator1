package com.example.epfinvestmentschemeeligibilitycalculator

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    val c: Calendar = Calendar.getInstance();
    val mYear = c.get(Calendar.YEAR);
    val mMonth = c.get(Calendar.MONTH);
    val mDay = c.get(Calendar.DAY_OF_MONTH);

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtDOB.setOnClickListener() {

            val datePickerDialog = DatePickerDialog(this,
                //set the result when ok is clicked
                DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                    txtDOB.setText(dayOfMonth.toString() + "-" + (month + 1) + "-" + year)
                }, mYear, mMonth, mDay
            )
            datePickerDialog.show()
        }
        



    }

}

