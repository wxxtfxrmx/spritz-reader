package com.wxxtfxrmx.spritzreader.di.ui

import androidx.fragment.app.FragmentManager
import com.wxxtfxrmx.spritzreader.R
import com.wxxtfxrmx.spritzreader.data.datasource.TabsDataSource
import com.wxxtfxrmx.spritzreader.data.datasource.TabsDataSourceImpl
import com.wxxtfxrmx.spritzreader.di.FragmentScope
import com.wxxtfxrmx.spritzreader.di.NestedFragmentScope
import com.wxxtfxrmx.spritzreader.navigation.Navigator
import com.wxxtfxrmx.spritzreader.navigation.tabs.TabsNavigator
import com.wxxtfxrmx.spritzreader.presentation.screens.library.LibraryFragment
import com.wxxtfxrmx.spritzreader.presentation.screens.reading.ReadingFragment
import com.wxxtfxrmx.spritzreader.presentation.tabs.TabsFragment
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
interface TabsModule {

	@Module
	companion object {

		@FragmentScope
		@Provides
		fun provideTabsFragmentManager(fragment: TabsFragment): FragmentManager =
			fragment.childFragmentManager

		@FragmentScope
		@Provides
		fun provideResId(): Int = R.id.tabsContainer
	}

	@Binds
	@FragmentScope
	fun bindTabsNavigator(tabsNavigator: TabsNavigator): Navigator

	@Binds
	@FragmentScope
	fun bindTabsRepository(repository: TabsDataSourceImpl): TabsDataSource

	@NestedFragmentScope
	@ContributesAndroidInjector(modules = [LibraryFragmentModule::class])
	fun provideLibraryFragment(): LibraryFragment

	@NestedFragmentScope
	@ContributesAndroidInjector(modules = [ReadingFragmentModule::class])
	fun provideReadingFragment(): ReadingFragment
}