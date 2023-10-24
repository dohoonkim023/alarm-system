package com.side.alarmsystem.alarm.adapter.out.persistence

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class AlarmJpaEntity(
        @Id @GeneratedValue
        val id: Long? = null,
) {

}
