package com.wxxtfxrmx.spritzreader.di.navigation

import androidx.fragment.app.FragmentManager
import com.wxxtfxrmx.spritzreader.R
import com.wxxtfxrmx.spritzreader.SpritzActivity
import com.wxxtfxrmx.spritzreader.di.*
import com.wxxtfxrmx.spritzreader.navigation.Navigator
import com.wxxtfxrmx.spritzreader.navigation.tabs.MainNavigator
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface NavigationModule {

    @Module
    companion object {

        @Provides
        @ActivityScope
        @ParentFragmentManager
        fun provideMainFragmentManager(activity: SpritzActivity): FragmentManager =
            activity.supportFragmentManager

        @Provides
        @ActivityScope
        @ParentContainerId
        fun provideContainerId(): Int =
            R.id.content
    }


    @Binds
    @ActivityScope
    @ParentNavigator
    fun bindMainNavigator(navigator: MainNavigator): Navigator
}