package com.example.listmaker

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TaskListAdapter(var list: TaskList) : RecyclerView.Adapter<TaskListViewHolder> {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskListViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return list.tasks.size
    }

    override fun onBindViewHolder(holder: TaskListViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}