package com.aqrlei.helper.log.config

import com.aqrlei.helper.log.LogLevel

/**
 * created by AqrLei on 2020/5/19
 */
interface ILogPrinterConfig {

    @LogLevel
    var level: Int
}