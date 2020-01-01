package org.ugur.microservices

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class CustomerServiceTest {

    @Autowired
    lateinit var customerService: CustomerService

    @Test
    fun getCustomers() {
        val customer = customerService.getCustomer(1)
        Assertions.assertEquals("Kotlin", customer?.name, "Customer 1 name is Kotlin")
    }

    @Test
    fun getAllCustomers() {
        val customers = customerService.getAllCustomers()
        Assertions.assertEquals(3, customers.size)
    }
}