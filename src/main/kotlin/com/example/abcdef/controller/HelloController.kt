package com.example.abcdef.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @RequestMapping("/hello-world")
    fun hello() : String {
        return "Hello, World!"
    }
}
