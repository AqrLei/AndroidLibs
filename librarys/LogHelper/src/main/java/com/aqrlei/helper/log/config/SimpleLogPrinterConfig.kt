package com.aqrlei.helper.log.config

import com.aqrlei.helper.log.LogLevel

/**
 * created by AqrLei on 2020/5/19
 */
class SimpleLogPrinterConfig : ILogPrinterConfig {

    companion object {
        fun create() = SimpleLogPrinterConfig()
    }

    override var level: Int = LogLevel.VERBOSE
}