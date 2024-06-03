package com.nhuallpa.solidexample.payroll.controller

import com.nhuallpa.solidexample.payroll.interactor.Employee
import com.nhuallpa.solidexample.payroll.interactor.HourReporterRequest
import com.nhuallpa.solidexample.payroll.interactor.HourReporterRequester

class HourReporterController {

    private lateinit var hourReporterRequester: HourReporterRequester
    private lateinit var hourReportPresenter: HourReportPresenter

    fun reportHours(employee: Employee) {
        val hourReporterResponse =  hourReporterRequester.generateReport(HourReporterRequest(employee))
        hourReportPresenter.printReport(hourReporterResponse.content)
    }
}