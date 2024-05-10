package com.nhuallpa.solidexample.payroll

class Employee (private val name:String,
                private val cuit:String,
                private val rate:Double,
                private var workingHours: Int){

    fun retrieveRate() = rate

    fun retrieveWorkingHours() = workingHours

}