package com.plcoding.cleanarchitecturenoteapp.feature.note.domain.util

/**
 * Created by burak on 04.06.22
 */
sealed class OrderType {
    object Ascending : OrderType()
    object Descending : OrderType()
}
