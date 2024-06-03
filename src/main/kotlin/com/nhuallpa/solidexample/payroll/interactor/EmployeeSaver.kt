package com.nhuallpa.solidexample.payroll.interactor

class EmployeeSaver {

    fun save(employee: Employee) {
        saveWithEntityManager(employee)
    }

    private fun saveWithEntityManager(employee: Employee) {
        print("Save data in the database")
    }

}