package com.nhuallpa.solidexample.payroll

class HourReporter {

    fun reportHours(employee: Employee) {
        // 1- Retrieve info from database
        val employeePayrollDetail =  retrievePayrollDetail(employee)
        // 2- Apply business logic
        val totalWorkingHours = computeTotalWorkingHour(employeePayrollDetail)
        // 3- Print the report in PDF
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