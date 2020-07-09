package com.aqrlei.helper.log.engine

import com.aqrlei.helper.log.config.ILogConfig
import com.aqrlei.helper.log.control.ILogControl
import com.aqrlei.helper.log.printer.ILogPrinter

/**
 * created by AqrLei on 2020/5/19
 */
interface ILogEngine {

    fun v(tag: String, msg: String, tr: Throwable? = null)
    fun v(msg: String, tr: Throwable? = null)

    fun d(tag: String, msg: String, tr: Throwable? = null)
    fun d(msg: String, tr: Throwable? = null)

    fun i(tag: String, msg: String, tr: Throwable? = null)
    fun i(msg: String, tr: Throwable? = null)

    fun w(tag: String, msg: String, tr: Throwable? = null)
    fun w(msg: String, tr: Throwable? = null)

    fun e(tag: String, msg: String, tr: Throwable? = null)
    fun e(msg: String, tr: Throwable? = null)

    fun config(logConfig:ILogConfig):ILogEngine

    fun logConfig():ILogConfig

    fun logControl():ILogControl

    fun logPrinters():Set<ILogPrinter>



    fun setLogPrinters(vararg logPrinter:ILogPrinter):ILogEngine

}