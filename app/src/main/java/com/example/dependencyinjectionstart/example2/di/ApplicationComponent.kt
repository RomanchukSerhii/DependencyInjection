package com.example.dependencyinjectionstart.example2.di

import android.app.Application
import com.example.dependencyinjectionstart.example2.presentation.MainActivity
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun inject(application: MainActivity)
}