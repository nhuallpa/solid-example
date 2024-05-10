package com.nhuallpa.solidexample.payroll

class HourReporter {

    fun reportHours(employee: Employee): String {
        print("Calling third-party library")
        return buildReport(employee.retrieveWorkingHours())
    }

    private fun buildReport(workingHours: Int): String {
        print("Calling third-party library to generate report")
        return "Report was built successful"
    }
}