package org.ugur.microservices

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseBody

@SpringBootApplication
class DemoApplication

@Controller
class FirstController(val exampleService: ExampleService) {

    @GetMapping(value = ["/user/{name}"])
    @ResponseBody
    fun hello(@PathVariable name :String) = exampleService.getHello(name)
}

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
