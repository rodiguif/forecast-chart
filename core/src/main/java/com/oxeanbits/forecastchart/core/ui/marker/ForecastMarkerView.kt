package com.oxeanbits.forecastchart.core.ui.marker

import android.annotation.SuppressLint
import android.content.Context
import android.widget.TextView
import com.github.mikephil.charting.components.MarkerView
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.highlight.Highlight
import com.github.mikephil.charting.utils.MPPointF
import com.oxeanbits.forecastchart.core.R
import com.oxeanbits.forecastchart.core.util.DateFormatter

@SuppressLint("ViewConstructor")
class ForecastMarkerView(context: Context?, layoutResource: Int, private val unity: String) :
    MarkerView(context, layoutResource) {

    @SuppressLint("SetTextI18n")
    override fun refreshContent(e: Entry?, highlight: Highlight?) {
        super.refreshContent(e, highlight)

        val prodContent: TextView = findViewById(R.id.prod_content)
        val dateContent: TextView = findViewById(R.id.date_content)

        val date = e?.x?.toLong()?.let {
            DateFormatter.timestampToDate(it)
        }

        prodContent.text = e?.y.toString() + unity
        dateContent.text = date
        super.refreshContent(e, highlight)
    }

    private var mOffset: MPPointF? = null

    override fun getOffset(): MPPointF {
        if (mOffset == null) {
            // center the marker horizontally and vertically
            mOffset = MPPointF((-(width / 2)).toFloat(), (-height - 10).toFloat())
        }

        return mOffset as MPPointF
    }
}