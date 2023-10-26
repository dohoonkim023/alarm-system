package com.side.alarmsystem.alarm.adapter.`in`.web

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SendAlarmController {

    @PostMapping("/alarm")
    fun sendAlarm(): String {
        return "sendAlarm"
    }
}
