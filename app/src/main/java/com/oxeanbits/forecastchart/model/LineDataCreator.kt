package com.oxeanbits.forecastchart.model

import com.github.mikephil.charting.data.Entry

data class LineDataCreator (
    val values: ArrayList<Entry>,
    val label: String,
    val color: Int,
    val unity: String
)