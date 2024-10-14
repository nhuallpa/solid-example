package com.nhuallpa.solidexample.payroll

class EmployeeSaver {

    fun save(employee: Employee) {
        saveWithEntityManager(employee)
    }

    private fun saveWithEntityManager(employee: Employee) {
        print("Save data in the database")
    }

}