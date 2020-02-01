package com.wxxtfxrmx.spritzreader.navigation.routers

import com.wxxtfxrmx.spritzreader.navigation.Command.Open
import com.wxxtfxrmx.spritzreader.navigation.Destination.*
import com.wxxtfxrmx.spritzreader.navigation.Navigator
import javax.inject.Inject

interface TabRouter {

    fun openLibraryScreen()

    fun openRecentScreen()

    fun openBookmarksScreen()
}

class TabRouterImpl @Inject constructor(
    private val navigator: Navigator
): TabRouter {

    override fun openLibraryScreen() {
        navigator.execute(Open(LibraryScreen))
    }

    override fun openRecentScreen() {
        navigator.execute(Open(RecentScreen))
    }

    override fun openBookmarksScreen() {
        navigator.execute(Open(BookmarksScreen))
    }
}