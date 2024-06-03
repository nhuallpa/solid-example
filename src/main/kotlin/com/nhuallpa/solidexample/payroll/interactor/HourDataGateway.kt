package com.nhuallpa.solidexample.payroll.interactor

interface HourDataGateway {

    fun findAll(): List<Employee>

    fun findByEmployee(employee: Employee): Employee

    fun findDetailsByEmployee(employee: Employee): EmployeePayrollDetail
}