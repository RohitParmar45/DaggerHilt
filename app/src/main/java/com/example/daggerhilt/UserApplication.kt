package com.example.daggerhilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class UserApplication : Application() {

    @Inject
    lateinit var userRepo: UserRepo;

    override fun onCreate() {
        super.onCreate()
        userRepo.saveUser("Ram", "dd")
    }

}