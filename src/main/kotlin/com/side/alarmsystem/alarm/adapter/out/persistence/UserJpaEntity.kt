package com.side.alarmsystem.alarm.adapter.out.persistence

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import java.time.LocalDateTime

@Entity
class UserJpaEntity(
    private val email: String,
    private val countryCode: Long,
    private val phoneNumber: Long,
    private val createdAt: LocalDateTime,

    @Id @GeneratedValue
    private val id: Long? = null,
) {
}
