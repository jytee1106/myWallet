package com.example.mywallet

import android.hardware.camera2.TotalCaptureResult
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date
import java.util.*

@Entity(tableName = "in_out_log")

data class InOutLog(
    @PrimaryKey(autoGenerate = true) val id:Int,
    val amount: Float,
    val type: Int,  // 1 = Income, 0 = Expenses
    val created_at: Long = System.currentTimeMillis()
)
