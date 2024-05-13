package com.nhuallpa.solidexample.payroll

private const val SALE_COMMISSION = 1000

private const val BONUS = 500

private const val PERFORMANCE_RATE = 500

private const val TRAVEL_ALLOWANCE = 100

class PayCalculator {

    fun calculatePay(employee: Employee): Double {
        var extra = 0;

        if (employee.role == "SELLER") {
            extra = SALE_COMMISSION
        } else if (employee.role == "STAFF_ENGINEER") {
            extra = 2 * BONUS + PERFORMANCE_RATE
        } else if (employee.role == "ASSISTANT") {
            extra = TRAVEL_ALLOWANCE
        }
        return processPayment(employee.retrieveRate(), employee.retrieveWorkingHours()) + extra;
    }

    private fun processPayment(retrieveRate: Double, retrieveWorkingHours: Int): Double {
        return retrieveRate * retrieveWorkingHours;
    }

}