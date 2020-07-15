package com.form.piechart

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.github.mikephil.charting.utils.ColorTemplate
import com.razerdp.widget.animatedpieview.AnimatedPieView
import com.razerdp.widget.animatedpieview.AnimatedPieViewConfig
import com.razerdp.widget.animatedpieview.data.SimplePieInfo
import kotlinx.android.synthetic.main.activity_main.*
import java.security.KeyStore

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        drawPie()
    }

    private fun drawPie() {
        val animatedPieView = findViewById<AnimatedPieView>(R.id.animatedPieChart)
        val config = AnimatedPieViewConfig()
        config.startAngle(-90f)
            .addData(SimplePieInfo(80.0, Color.parseColor("#7F0C00"), "Islam"))
            .addData(SimplePieInfo(11.0, Color.parseColor("#FF1700"), "Kristen"))
            .addData(SimplePieInfo(81.0, Color.parseColor("#400600"), "Lainnya"))
            .drawText(true)
            .strokeMode(false)
            .duration(2000)
        animatedPieView.applyConfig(config)
        animatedPieView.start()
    }

}