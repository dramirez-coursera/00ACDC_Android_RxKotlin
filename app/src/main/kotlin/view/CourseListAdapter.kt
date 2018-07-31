package view

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import model.Course
import org.coursera.android.acdc.R

class CourseListAdapter: RecyclerView.Adapter<CourseListViewHolder>() {

    val courseList: MutableList<Course> = mutableListOf()

    fun setData(courses: List<Course>) {
        courseList.clear()
        courseList.addAll(courses)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = courseList.size

    override fun onBindViewHolder(holder: CourseListViewHolder, position: Int) {
        val course = courseList[position]
        holder.setName(course.name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_course, parent, false)
        return CourseListViewHolder(view)
    }
}