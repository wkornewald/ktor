/*
 * Copyright 2014-2019 JetBrains s.r.o and contributors. Use of this source code is governed by the Apache 2.0 license.
 */

package io.ktor.http

import java.net.*

/**
 * Construct [Url] from [String]
 */
operator fun Url.Companion.invoke(fullUrl: String): Url = URLBuilder().apply {
    takeFrom(URI(fullUrl))
}.build()
