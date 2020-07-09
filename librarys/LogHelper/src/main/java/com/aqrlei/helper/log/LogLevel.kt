package com.aqrlei.helper.log

import android.util.Log
import androidx.annotation.IntDef
import com.aqrlei.helper.log.LogLevel.Companion.ASSERT
import com.aqrlei.helper.log.LogLevel.Companion.DEBUG
import com.aqrlei.helper.log.LogLevel.Companion.ERROR
import com.aqrlei.helper.log.LogLevel.Companion.INFO
import com.aqrlei.helper.log.LogLevel.Companion.VERBOSE
import com.aqrlei.helper.log.LogLevel.Companion.WARN

/**
 * created by AqrLei on 2020/5/19
 */


@IntDef(*[VERBOSE, DEBUG, INFO, WARN, ERROR, ASSERT])
annotation class LogLevel {
    companion object {
        const val VERBOSE = Log.VERBOSE
        const val DEBUG = Log.DEBUG
        const val INFO = Log.INFO
        const val WARN = Log.WARN
        const val ERROR = Log.ERROR
        const val ASSERT = Log.ASSERT
    }
}