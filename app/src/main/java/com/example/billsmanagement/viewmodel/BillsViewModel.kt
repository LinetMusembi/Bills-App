package com.example.billsmanagement.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.billsmanagement.model.Bill
import com.example.billsmanagement.repository.BillsRepository
import kotlinx.coroutines.launch

class BillsViewModel: ViewModel() {

    var billsRepo = BillsRepository()

    fun saveBill(bill: Bill){
        viewModelScope.launch {
            billsRepo.saveBill(bill)
        }
    }
}