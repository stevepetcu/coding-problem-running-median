package com.stefanpetcu.codingproblemrunningmedian.utils

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class RunningMedianListTest {
    private val subject = RunningMedianList()

    @Test
    fun add_returnsTheMedianValueOfTheList_givenItIsCalledRepeatedly() {
        val listOfArguments = arrayOf(
                Pair(2.0, 2.0),
                Pair(1.0, 1.5),
                Pair(5.0, 2.0),
                Pair(7.0, 3.5),
                Pair(2.0, 2.0),
                Pair(0.0, 2.0),
                Pair(5.0, 2.0),
        )

        listOfArguments.forEach {
            assertEquals(it.second, subject.add(it.first))
        }
    }
}
