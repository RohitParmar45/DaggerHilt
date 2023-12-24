package com.example.daggerhilt

import android.util.Log
import javax.inject.Inject

class LoggerService @Inject constructor(){
    fun logger(message : String){
        Log.d("MyTag", "logger: $message")
    }
}