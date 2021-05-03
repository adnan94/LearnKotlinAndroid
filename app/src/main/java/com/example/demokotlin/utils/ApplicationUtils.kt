package com.example.demokotlin.utils

import android.content.Context
import android.widget.Toast

class ApplicationUtils {

   companion object {
       fun showToast(text: String, applicationContext: Context){
           Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT).show()
       }
   }
}