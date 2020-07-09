package com.aqrlei.helper.log.printer

import com.aqrlei.helper.log.LogLevel

/**
 * created by AqrLei on 2020/5/19
 */
abstract class AbstractLogPrinter : ILogPrinter {

    override fun print(level: Int, printerEntity: PrinterEntity) {

    }

    override val level: Int
        get() = LogLevel.VERBOSE
}