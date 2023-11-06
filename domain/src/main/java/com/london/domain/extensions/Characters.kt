package com.london.domain.extensions

import java.lang.ProcessHandle.Info

data class Characters(
    val info: Info,
    val results: List<Result>
)