/*
 * Copyright (c) 2020 Din.
 */

package blog.din.kotlinhelloworld.handler

import org.springframework.stereotype.Component
import reactor.core.publisher.Mono

@Component
class HelloWorldHandler {
    fun helloworld(): Mono<Map<*, *>> {
        return Mono.just(mapOf("Hello" to "World", "I'm" to "Din."))
    }
}