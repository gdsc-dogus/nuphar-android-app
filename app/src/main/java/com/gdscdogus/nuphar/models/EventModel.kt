package com.gdscdogus.nuphar.models

import java.time.Instant

data class EventModel(
    var id: String,
    var title: String,
    var description: String,
    var address: String,
    var coordinates: CoordinatesModel,
    var creatorId: String,
    var creationDate: Instant
)
