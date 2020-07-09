package com.aqrlei.widget.bannerview2.manager

import android.content.Context
import android.util.AttributeSet
import com.aqrlei.widget.bannerview.options.BannerOptions

/**
 * created by AqrLei on 2019-12-12
 */
class BannerManager {
    val bannerOptions: BannerOptions = BannerOptions()
    private val attributeController: AttributeController = AttributeController(bannerOptions)

    fun initAttrs(context: Context, attrs: AttributeSet?) {
        attributeController.init(context, attrs)
    }
}
