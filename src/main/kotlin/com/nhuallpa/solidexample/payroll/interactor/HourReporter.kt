package com.nhuallpa.solidexample.payroll.interactor

class HourReporter : HourReporterRequester{

    private lateinit var hourDataGateway:HourDataGateway;

    fun reportHours(employee: Employee) : String {
        val employeePayrollDetail =  hourDataGateway.findDetailsByEmployee(employee)
        val totalWorkingHours = computeTotalWorkingHour(employeePayrollDetail)
        return buildReport(employee, totalWorkingHours)
    }

    override fun generateReport(hourReporterRequest: HourReporterRequest): HourReporterResponse {
        return HourReporterResponse(this.reportHours(hourReporterRequest.employee));
    }

    private fun computeTotalWorkingHour(employeePayrollDetail: EmployeePayrollDetail): Int {
        return employeePayrollDetail.workingDailyHours.sum()
    }

    private fun buildReport(
        employee: Employee,
        totalWorkingHours: Int
    ) = "Employee: ${employee}, total woking hour: ${totalWorkingHours}, history: ${employee.retrieveWorkingHours()}"
}