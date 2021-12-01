package org.ugur.microservices

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.ugur.microservices.model.Customer
import org.ugur.microservices.repository.CustomerRepository

@SpringBootApplication
class DemoApplication {

}

@Bean
fun init(repository: CustomerRepository) = CommandLineRunner {
    repository.save(Customer(1, "Bauer"))
    repository.save(Customer(2, "O'Brian"))
    repository.save(Customer(3, "Bauer"))
    repository.save(Customer(4, "Palmer"))
}

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
