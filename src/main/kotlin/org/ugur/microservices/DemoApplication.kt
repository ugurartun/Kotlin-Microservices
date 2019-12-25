package org.ugur.microservices

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@SpringBootApplication
class DemoApplication

@Controller
class FirstController {

    @GetMapping(value = ["/user"])
    @ResponseBody
    fun hello() = "hello user"
}

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
