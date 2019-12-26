package org.ugur.microservices

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import java.util.concurrent.ConcurrentHashMap

@SpringBootApplication
class DemoApplication  {
    companion object {
        val initialCustomers = arrayOf(Customer(1, "Kotlin"),
                Customer(2, "Spring"),
                Customer(3 , "Microservice"))
    }

    @Bean
    fun customers() = ConcurrentHashMap<Int, Customer>(initialCustomers.associateBy (Customer::id))

}


fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
