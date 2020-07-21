package com.aqrlei.net.transformer.json.factory

import com.aqrlei.net.ITransformer
import com.aqrlei.net.ITransformerFactory
import com.aqrlei.net.transformer.json.MoshiJsonTransformer

/**
 * created by AqrLei on 2020/3/20
 */
class DefaultJsonTransformerFactory private constructor() :
    ITransformerFactory {
    companion object {
        fun create() =
            DefaultJsonTransformerFactory()
    }

    override fun <T> createTransformer(): ITransformer<T> {
        return MoshiJsonTransformer.createJsonParser()
    }
}