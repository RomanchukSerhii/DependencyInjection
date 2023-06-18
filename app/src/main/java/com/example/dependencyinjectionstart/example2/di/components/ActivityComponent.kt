package com.example.dependencyinjectionstart.example2.di.components

import com.example.dependencyinjectionstart.example2.di.annotations.IdQualifier
import com.example.dependencyinjectionstart.example2.di.annotations.NameQualifier
import com.example.dependencyinjectionstart.example2.di.modules.ViewModelModule
import com.example.dependencyinjectionstart.example2.presentation.MainActivity
import com.example.dependencyinjectionstart.example2.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent(modules = [ViewModelModule::class])
interface ActivityComponent {
    fun inject(application: MainActivity)
    fun inject(application: MainActivity2)

    @Subcomponent.Factory
    interface Factory {

        fun create(
            @BindsInstance @IdQualifier id: String,
            @BindsInstance @NameQualifier name: String
        ) : ActivityComponent
    }
}