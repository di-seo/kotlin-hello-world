/*
 * Copyright (c) 2020 Din.
 */

package blog.din.kotlinhelloworld.configuration

import blog.din.kotlinhelloworld.handler.HelloWorldHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.router

@Configuration
class HelloWorldRoutingConfiguration(private val handler: HelloWorldHandler) {
    @Bean
    fun route() = router {
        (accept(MediaType.APPLICATION_JSON) and "/handler").nest {
            GET("/helloworld") {
                ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(handler.helloworld(), Any::class.java)

            }
        }
    }
}