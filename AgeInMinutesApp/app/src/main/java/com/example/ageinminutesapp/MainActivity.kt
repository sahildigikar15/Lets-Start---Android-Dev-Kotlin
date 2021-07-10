 package com.example.ageinminutesapp

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val but_click = findViewById(R.id.btnDatePicker) as Button
        but_click.setOnClickListener{view ->
            clickDatePicker(view)
            //Toast.makeText(this,"Button Works", Toast.LENGTH_LONG).show()
        }


    }
     fun clickDatePicker(view: View)
     {
         val myCalender = Calendar.getInstance()
         val year = myCalender.get(Calendar.YEAR)
         val month = myCalender.get(Calendar.MONTH)
         val day = myCalender.get(Calendar.DAY_OF_MONTH)

        DatePickerDialog(this,DatePickerDialog.OnDateSetListener { view, selectedyear, selectedmonth, selectedDayOfMonth ->

            val selectedDate = "$selectedDayOfMonth/${selectedmonth+1}/$selectedyear"
            val textbt = findViewById(R.id.tvSelectedDate) as TextView
            textbt.setText(selectedDate)

            val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)
            val theDate = sdf.parse(selectedDate)
            val selectedDateinMinutes = theDate!!.time / 60000

            val currentDate = sdf.parse(sdf.format(System.currentTimeMillis()))
            val currentDateToMinutes = currentDate!!.time/60000
            val differenceInMinutes = currentDateToMinutes -  selectedDateinMinutes

            val textbtMin = findViewById(R.id.tvSelectedDateInMinutes) as TextView
            textbtMin.setText(differenceInMinutes.toString())







        },year,month,day).show()
     }
}