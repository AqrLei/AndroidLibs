package com.aqrlei.helper.log.control

import com.aqrlei.helper.log.LogLevel
import com.aqrlei.helper.log.printer.ILogPrinter

/**
 * created by AqrLei on 2020/5/19
 */
interface ILogControl {
    fun buildPrintTag(logPrinter:ILogPrinter,@LogLevel level:Int,globalTag:String="default",moduleName:String="default",tagModel:String="default"):String

    fun buildPrintMessage(message:String,tr:Throwable?):String

    fun enabled(configEnabled:Boolean, @LogLevel configLevel:Int, @LogLevel printLevel:Int , logPrinters:Set<ILogPrinter>) :Boolean

}