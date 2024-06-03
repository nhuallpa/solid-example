package com.nhuallpa.solidexample.payroll.database

import com.nhuallpa.solidexample.payroll.interactor.Employee
import com.nhuallpa.solidexample.payroll.interactor.EmployeePayrollDetail
import com.nhuallpa.solidexample.payroll.interactor.HourDataGateway

class HourDataMapper : HourDataGateway {
    override fun findAll(): List<Employee> {
        TODO("Not yet implemented")
    }

    override fun findByEmployee(employee: Employee): Employee {
        TODO("Not yet implemented")
    }

    override fun findDetailsByEmployee(employee: Employee): EmployeePayrollDetail {
        TODO("Not yet implemented")
    }
}