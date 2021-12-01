package org.ugur.microservices

import org.springframework.stereotype.Service

@Service
class ExampleService : ServiceInterface {
    override fun getHello(name: String) = "hello $name"
}
