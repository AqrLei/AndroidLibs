package com.aqrlei.net.transformer

import com.aqrlei.net.BuildConfig.logger
import com.aqrlei.net.IS_DEBUG
import com.aqrlei.net.ITransformer

/**
 * created by AqrLei on 2020/4/21
 */
abstract class AbstractTransformer<T> : ITransformer<T> {
    protected val tag = "Transformer"

    protected fun log(message:String){
        if (IS_DEBUG) {
            logger.d(tag, message)
        }
    }
}