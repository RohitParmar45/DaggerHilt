package com.example.daggerhilt

import android.util.Log
import java.util.logging.Logger
import javax.inject.Inject

class UserRepo @Inject constructor(val logger: LoggerService)  {

    fun saveUser(name : String , pass : String){
//        Log.d("MyTag", "saveUser: in db $pass")
           logger.logger("hello")
    }

}