package io.ktor.client.engine

import io.ktor.http.*

/**
 * Proxy configuration.
 *
 * See [ProxyBuilder] to create proxy.
 */
actual class ProxyConfig

/**
 * [ProxyConfig] factory.
 */
actual object ProxyBuilder {
    /**
     * Create http proxy from [url].
     */
    actual fun http(url: Url): ProxyConfig {
        error("Proxy unsupported in js client engine.")
    }

    /**
     * Create socks proxy from [host] and [port].
     */
    actual fun socks(host: String, port: Int): ProxyConfig {
        error("Proxy unsupported in js client engine.")
    }
}
