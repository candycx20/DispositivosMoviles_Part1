package com.example.tarea1_dispositivosmoviles


fun main() {
    val conversionFormulaCelFar: (Double) -> Double = { celsius -> celsius * 9/5 + 32 }
    val conversionFormulaKelCel: (Double) -> Double = { kelvin -> kelvin - 273.15 }
    val conversionFormulaFarKel: (Double) -> Double = { fahrenheit  -> 5/9 * (fahrenheit - 32) + 273.15  }

    val conversions = listOf(
        Triple("Celsius", "Fahrenheit", conversionFormulaCelFar),
        Triple("Kelvin", "Celsius", conversionFormulaKelCel),
        Triple("Fahrenheit", "Kelvin", conversionFormulaFarKel)
    )

    for ((initialUnit, finalUnit, conversionFormula) in conversions) {
        val initialMeasurement = when (initialUnit) {
            "Celsius" -> 27.0
            "Kelvin" -> 350.0
            "Fahrenheit" -> 10.0
            else -> throw IllegalArgumentException("Unidad desconocida")
        }
        printFinalTemperature(initialMeasurement, initialUnit, finalUnit, conversionFormula)
    }
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}