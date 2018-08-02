package org.coursera.android.acdc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import view.CourseListAdapter
import presenter.CourseListPresenter

class MainActivity : AppCompatActivity() {

    private lateinit var courseRecyclerView: RecyclerView
    private lateinit var courseAdapter: CourseListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        courseAdapter = CourseListAdapter()

        courseRecyclerView = findViewById(R.id.courseRecyclerView)
        courseRecyclerView.adapter = courseAdapter
        courseRecyclerView.layoutManager = LinearLayoutManager(this)
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }
}
