package com.nhuallpa.solidexample.payroll

class PayCalculator {

    fun calculatePay(employee: Employee): Double {
        print("Apply business rules")
        return processPayment(employee.retrieveRate(), employee.retrieveWorkingHours())
    }

    private fun processPayment(retrieveRate: Double, retrieveWorkingHours: Int): Double {
        return retrieveRate * retrieveWorkingHours;
    }

}