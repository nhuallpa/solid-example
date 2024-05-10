package com.nhuallpa.solidexample.payroll

data class Employee(
    val name: String,
    val cuit: String,
    val rate: Double,
    val role: String,
    var workingHours: Int
) {

    fun retrieveRate() = rate

    fun retrieveWorkingHours() = workingHours

}