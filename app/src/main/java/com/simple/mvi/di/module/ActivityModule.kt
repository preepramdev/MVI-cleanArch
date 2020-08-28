package com.simple.mvi.di.module

import android.content.Context
import com.simple.mvi.di.common.AppRouter
import com.simple.mvi.ui.common.RootBaseActivity
import dagger.Module
import dagger.Provides

/**
 * Created by Rim Gazzah on 8/19/20.
 **/
@Module
class ActivityModule constructor(private val activity : RootBaseActivity) {

    @Provides
    fun providesActivityContext() : Context = activity.application

    @Provides
    fun providesActivity() : RootBaseActivity { return activity}


    @Provides
    fun providesRouterComponent() : AppRouter = AppRouter(activity)
}