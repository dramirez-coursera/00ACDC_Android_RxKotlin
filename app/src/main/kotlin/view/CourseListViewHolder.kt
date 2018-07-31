package view

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import org.coursera.android.acdc.R

class CourseListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val courseName: TextView = itemView.findViewById(R.id.course_name)

    fun setName(name: String) {
        courseName.text = name
    }
}