package com.example.mywallet

import androidx.lifecycle.LiveData


class InOutLogRepository(private val inOutLogDao: InOutLogDao) {

    val allLogs : LiveData<List<InOutLog>> = inOutLogDao.getLogs()

    suspend fun insertLog(inOutLog: InOutLog){
        inOutLogDao.insertLog(inOutLog)
    }
}