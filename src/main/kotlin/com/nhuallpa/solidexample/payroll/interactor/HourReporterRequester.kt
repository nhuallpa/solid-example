package com.nhuallpa.solidexample.payroll.interactor

interface HourReporterRequester {

    fun generateReport(hourReporterRequest: HourReporterRequest ): HourReporterResponse

}