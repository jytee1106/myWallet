package com.example.mywallet

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData

class InOutLogViewModel(application: Application) :
        AndroidViewModel(application){

    private val repository: InOutLogRepository

    val allLogs : LiveData<List<InOutLog>>

    init {
        val inOutLogDao = InOutLogDatabase.getDatabase(application).inOutLogDao()

        repository = InOutLogRepository(inOutLogDao)
        allLogs = repository.allLogs
    }

    //ViewModel to use corountine to perform ong process
    fun inserting(inOutLog: InOutLog) = viewModelScope.launch{
        repository.insertLog(inOutLog)
    }
}