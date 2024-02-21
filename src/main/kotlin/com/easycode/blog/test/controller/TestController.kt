package com.easycode.blog.test.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {
    @GetMapping("/test")
    fun test(): String {
        return "test"
    }

    @GetMapping("/test/hi")
    fun index(@RequestParam("name") name: String): ResponseEntity<String> {
        return ResponseEntity.ok("Hello, $name!")
    }

    @PostMapping("/test")
    fun testBody() {

    }
}