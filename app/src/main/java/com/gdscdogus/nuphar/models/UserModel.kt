package com.gdscdogus.nuphar.models

import java.time.Instant

data class UserModel(
    var id: String,
    var email: String,
    var nameSurname: String,
    var country: String,
    var userType: UserType,
    var creationDate: Instant
)
