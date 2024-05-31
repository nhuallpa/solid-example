package com.nhuallpa.solidexample.payroll

class HourReporter {

    fun reportHours(employee: Employee) {
        val employeePayrollDetail =  retrievePayrollDetail(employee)
        val totalWorkingHours = computeTotalWorkingHour(employeePayrollDetail)
        printReport(employee, employeePayrollDetail, totalWorkingHours)
    }

    private fun computeTotalWorkingHour(employeePayrollDetail: EmployeePayrollDetail): Int {
        return employeePayrollDetail.workingDailyHours.sum()
    }

    private fun retrievePayrollDetail(employee: Employee): EmployeePayrollDetail {
        print("Retrieve Payroll information for $employee")
        return EmployeePayrollDetail(listOf())
    }

    private fun printReport(employee: Employee, employeePayrollDetail: EmployeePayrollDetail, totalWorkingHours: Int): String {
        printPdf()
        return "Report was built successful"
    }

    private fun printPdf() {
        print("Calling third-party library to generate report")
    }
}