package com.example.todolist.datasource

import com.example.todolist.model.Task
import java.util.*

object TaskDataSource {
    private val list = ArrayList<Task>()

    fun getList() = list.toList()

    fun insertTask(task: Task){
        if(task.id ==0){
            list.add(task.copy(id = list.size +1))
        }else{
            list.remove(task)
            list.add(task)
        }

    }

    fun findById(taskId: Int): Task? {
        return list.find {
            it.id == taskId
        }
    }

    fun deleteTask(task: Task){
        list.remove(task)
    }

}