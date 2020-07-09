package com.aqrlei.helper.log.config

import android.content.Context
import com.aqrlei.helper.log.LogLevel
import java.lang.ref.WeakReference

/**
 * created by AqrLei on 2020/5/19
 */
interface ILogConfig {

    var reference: WeakReference<Context?>

    @LogLevel
    var level: Int

    var globalTag: String

    var enable: Boolean
}