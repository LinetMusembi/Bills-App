package com.example.billsmanagement.repository

import com.example.billsmanagement.BillzApp
import com.example.billsmanagement.database.BillzDb
import com.example.billsmanagement.model.Bill
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class BillsRepository {
    val db = BillzDb.getDatabase(BillzApp.appContext)
    val billDao = db.billDao()

    suspend fun saveBill(bill: Bill){
        withContext(Dispatchers.IO){
            billDao.insertBill(bill)
        }
    }
}