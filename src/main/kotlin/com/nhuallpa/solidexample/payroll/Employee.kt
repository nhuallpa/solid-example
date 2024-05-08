package com.nhuallpa.solidexample.payroll

private const val NORMAL_HOURS = 160

class Employee (name:String, cuit:String){

    private fun getTimeOffInHours() = 8

    fun calculatePay(): Int {
        return 30 * workingHours();
    }

    fun reportHours(): Int {
        return convertToExcel(workingHours())
    }

    fun save() {
        print("Save data in the database")
    }

    private fun convertToExcel(workingHours: Int): Int {
        TODO("Not yet implemented")
    }

    private fun workingHours():Int {
        return NORMAL_HOURS - getTimeOffInHours();
    }
}