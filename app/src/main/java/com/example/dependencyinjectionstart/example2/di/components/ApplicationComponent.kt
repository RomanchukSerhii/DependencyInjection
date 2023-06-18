package com.example.dependencyinjectionstart.example2.di.components

import android.content.Context
import com.example.dependencyinjectionstart.example2.di.annotations.ApplicationScope
import com.example.dependencyinjectionstart.example2.di.modules.DataModule
import com.example.dependencyinjectionstart.example2.di.modules.DomainModule
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun activityComponentFactory() : ActivityComponent.Factory


    @Component.Factory
    interface ApplicationComponentFactory {
        fun create(
            @BindsInstance context: Context,
            @BindsInstance timeMillis: Long
        ): ApplicationComponent
    }
}