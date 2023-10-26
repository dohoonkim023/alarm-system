package com.side.alarmsystem.alarm.adapter.out.persistence

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import java.time.LocalDateTime

@Entity
class DeviceJpaEntity(
    private val deviceToken: String,
    private val userId: Long,
    private val lastLoggedInAt: LocalDateTime,

    @Id @GeneratedValue
    private val id: Long? = null,
) {
}
