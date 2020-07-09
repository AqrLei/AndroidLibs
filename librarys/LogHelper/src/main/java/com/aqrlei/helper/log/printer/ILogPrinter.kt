package com.aqrlei.helper.log.printer

import com.aqrlei.helper.log.LogLevel

/**
 * created by AqrLei on 2020/5/19
 */
interface ILogPrinter {

    fun print(level: Int, printerEntity: PrinterEntity)

    @LogLevel
    val level: Int
}