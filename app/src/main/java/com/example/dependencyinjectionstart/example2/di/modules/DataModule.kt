package com.example.dependencyinjectionstart.example2.di.modules

import com.example.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSource
import com.example.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSourceImpl
import com.example.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSource
import com.example.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSourceImpl
import com.example.dependencyinjectionstart.example2.data.datasource.TestExampleRemoteDataSourceImpl
import com.example.dependencyinjectionstart.example2.di.annotations.ApplicationScope
import com.example.dependencyinjectionstart.example2.di.annotations.ProdQualifier
import com.example.dependencyinjectionstart.example2.di.annotations.TestQualifier
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @ApplicationScope
    @Binds
    @ProdQualifier
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

    @ApplicationScope
    @Binds
    @TestQualifier
    fun bindTestRemoteDataSource(impl: TestExampleRemoteDataSourceImpl): ExampleRemoteDataSource
}