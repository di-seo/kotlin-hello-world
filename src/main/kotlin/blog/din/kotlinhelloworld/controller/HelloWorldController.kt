/*
 * Copyright (c) 2020 Din.
 */

package blog.din.kotlinhelloworld.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class HelloWorldController() {
    @GetMapping("/rest/helloworld")
    fun helloworld(): Mono<Map<*, *>> {
        return Mono.just(mapOf("Hello" to "World", "I'm" to "Din."))
    }
}
