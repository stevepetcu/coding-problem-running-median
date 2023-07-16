package com.stefanpetcu.codingproblemrunningmedian.utils

data class RunningMedianList(val values: MutableList<Double> = mutableListOf()) {
    fun add(value: Double): Double {
        values.add(value)

        return median()
    }

    private fun median(): Double {
        values.sort()

        if (values.size % 2 == 1) {
            return values[Math.floorDiv(values.size, 2)]
        }

        return (values[values.size / 2 - 1] + values[values.size / 2]) / 2
    }
}
