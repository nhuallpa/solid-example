package com.nhuallpa.solidexample.payroll

private const val SALE_COMMISSION = 1000

private const val BONUS = 500

private const val PERFORMANCE_RATE = 500

private const val TRAVEL_ALLOWANCE = 100

class PayCalculator {

    fun calculatePay(employee: Employee): Double {
        var additional = 0;

        if (employee.role == "SELLER") {
            additional = SALE_COMMISSION
        } else if (employee.role == "STAFF_ENGINEER") {
            additional = 2 * BONUS + PERFORMANCE_RATE
        } else {
            additional = TRAVEL_ALLOWANCE
        }
        return processPayment(employee.retrieveRate(), employee.retrieveWorkingHours()) + additional;
    }

    private fun processPayment(retrieveRate: Double, retrieveWorkingHours: Int): Double {
        return retrieveRate * retrieveWorkingHours;
    }

}