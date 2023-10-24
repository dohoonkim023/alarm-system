package com.side.alarmsystem

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AlarmSystemApplication

fun main(args: Array<String>) {
    runApplication<AlarmSystemApplication>(*args)
}
