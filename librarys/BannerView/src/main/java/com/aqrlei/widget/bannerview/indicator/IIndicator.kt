package com.aqrlei.widget.bannerview.indicator

import com.aqrlei.widget.bannerview.options.IndicatorOptions
import com.aqrlei.widget.bannerview.page.OnBannerPageChangeListener

/**
 * created by AqrLei on 2019-12-11
 */
interface IIndicator : OnBannerPageChangeListener {
    var indicatorOptions: IndicatorOptions
    fun setPageSize(pageSize: Int)
}