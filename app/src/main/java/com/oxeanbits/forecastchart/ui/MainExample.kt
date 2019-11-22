package com.oxeanbits.forecastchart.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.oxeanbits.forecastchart.core.ui.component.forecastChartComponent
import com.oxeanbits.forecastchart.util.SetupChartExample
import trikita.anvil.BaseDSL.MATCH
import trikita.anvil.BaseDSL.size
import trikita.anvil.RenderableView

class MainExample : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getView())
    }

    private fun getView(): View {
        return object : RenderableView(this) {
            override fun view() {
                forecastChartComponent{
                    size(MATCH, 350)
                    loadForecastChart(
                        SetupChartExample.getExpectedObj(),
                        SetupChartExample.getActualObj()
                    )
                }
            }
        }
    }
}