package com.thedancercodes.fastlanedroid.todoapp.statistics

import android.content.Context
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.core.app.ApplicationProvider.getApplicationContext
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.MediumTest
import com.thedancercodes.fastlanedroid.todoapp.R
import com.thedancercodes.fastlanedroid.todoapp.ServiceLocator
import com.thedancercodes.fastlanedroid.todoapp.data.Task
import com.thedancercodes.fastlanedroid.todoapp.data.source.FakeRepository
import com.thedancercodes.fastlanedroid.todoapp.data.source.TasksRepository
import com.thedancercodes.fastlanedroid.todoapp.util.DataBindingIdlingResource
import com.thedancercodes.fastlanedroid.todoapp.util.monitorFragment
import com.thedancercodes.fastlanedroid.todoapp.util.saveTaskBlocking
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config

/**
 * Integration test for the statistics screen.
 */
//@RunWith(AndroidJUnit4::class)
//@MediumTest
//@ExperimentalCoroutinesApi
//@Config(sdk =  [Build.VERSION_CODES.P])
//class StatisticsFragmentTest {
//    private lateinit var repository: TasksRepository
//
//    // An Idling Resource that waits for Data Binding to have no pending bindings
//    private val dataBindingIdlingResource = DataBindingIdlingResource()
//
//    @Before
//    fun initRepository() {
//        repository = FakeRepository()
//        ServiceLocator.tasksRepository = repository
//    }
//
//    @After
//    fun cleanupDb() = runBlockingTest {
//        ServiceLocator.resetRepository()
//    }
//
//    /**
//     * Idling resources tell Espresso that the app is idle or busy. This is needed when operations
//     * are not scheduled in the main Looper (for example when executed on a different thread).
//     */
//    @Before
//    fun registerIdlingResource() {
//        IdlingRegistry.getInstance().register(dataBindingIdlingResource)
//    }
//
//    /**
//     * Unregister your Idling Resource so it can be garbage collected and does not leak any memory.
//     */
//    @After
//    fun unregisterIdlingResource() {
//        IdlingRegistry.getInstance().unregister(dataBindingIdlingResource)
//    }
//
////    @Test
////    fun tasks_showsNonEmptyMessage() {
////        // Given some tasks
////        repository.apply {
////            saveTaskBlocking(Task("Title1", "Description1", false))
////            saveTaskBlocking(Task("Title2", "Description2", true))
////        }
////
////        val scenario = launchFragmentInContainer<StatisticsFragment>(Bundle(), R.style.AppTheme)
////        dataBindingIdlingResource.monitorFragment(scenario)
////
////        val expectedActiveTaskText = getApplicationContext<Context>()
////            .getString(R.string.statistics_active_tasks, 50.0f)
////        val expectedCompletedTaskText = getApplicationContext<Context>()
////            .getString(R.string.statistics_completed_tasks, 50.0f)
////        // check that both info boxes are displayed and contain the correct info
////        onView(withId(R.id.stats_active_text)).check(matches(isDisplayed()))
////        onView(withId(R.id.stats_active_text)).check(matches(withText(expectedActiveTaskText)))
////        onView(withId(R.id.stats_completed_text)).check(matches(isDisplayed()))
////        onView(withId(R.id.stats_completed_text)).check(matches(withText(expectedCompletedTaskText)))
////    }
//}
