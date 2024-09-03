package com.nhuallpa.solidexample.payroll

class Employee (private val name:String,
                private val cuit:String,
                private val rate:Double,
                private var workingHours: Int){

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
        return retrieveRate * retrieveWorkingHours;
    }

    private fun retrieveRate() = rate

    private fun retrieveWorkingHours() = workingHours
}