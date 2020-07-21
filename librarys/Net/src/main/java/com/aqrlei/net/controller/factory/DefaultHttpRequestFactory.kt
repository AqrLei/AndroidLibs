package com.aqrlei.net.controller.factory

import com.aqrlei.net.IHttpCallback
import com.aqrlei.net.IHttpRequestController
import com.aqrlei.net.IHttpRequestFactory
import com.aqrlei.net.ITransformer
import com.aqrlei.net.controller.CoroutineRequestController

/**
 * created by AqrLei on 2020/3/20
 */
class DefaultHttpRequestFactory private constructor() :
    IHttpRequestFactory {
    companion object {
        fun create() = DefaultHttpRequestFactory()
    }

    override fun <T> createHttpRequest(
        callback: IHttpCallback<T>,
        transformer: ITransformer<T>): IHttpRequestController<T> {
        return CoroutineRequestController.build(callback, transformer)
    }

}