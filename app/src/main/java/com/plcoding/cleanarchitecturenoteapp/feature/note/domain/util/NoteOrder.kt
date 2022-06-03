package com.plcoding.cleanarchitecturenoteapp.feature.note.domain.util

/**
 * Created by burak on 04.06.22
 */
sealed class NoteOrder(val orderType: OrderType) {
    class Title(orderType: OrderType):NoteOrder(orderType)
    class Date(orderType: OrderType):NoteOrder(orderType)
    class Color(orderType: OrderType):NoteOrder(orderType)
}
