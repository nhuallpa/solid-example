package com.nhuallpa.solidexample.payroll

private const val NORMAL_HOURS = 160

private const val RATE_USD: Double = 30.0

class Employee (name:String, cuit:String){

    private fun getTimeOffInHours() = 8

    fun calculatePay(): Double {
        print("Apply business rules")
        return processPayment(retrieveRate(), retrieveWorkingHours())
    }

    fun reportHours(): String {
        print("Calling third-party library")
        return buildReport(retrieveWorkingHours())
    }

    fun save() {
        saveWithEntityManager(this)
    }

    private fun saveWithEntityManager(employee: Employee) {
        print("Save data in the database")
    }

    private fun buildReport(workingHours: Int): String {
        print("Calling third-party library to generate report")
        return "Report was built successful"
    }

    private fun processPayment(retrieveRate: Double, retrieveWorkingHours: Int): Double {
        return retrieveRate() * retrieveWorkingHours();
    }

    private fun retrieveRate() = RATE_USD

    private fun retrieveWorkingHours():Int {
        return NORMAL_HOURS
    }
}