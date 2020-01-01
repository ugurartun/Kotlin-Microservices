package org.ugur.microservices

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
        assertEquals("Kotlin", customer?.name, "Customer 1 name is Kotlin")
    }

    @Test
    fun getAllCustomers() {
        val customers = customerService.getAllCustomers()
        assertEquals(3, customers.size)
    }

    @Test
    fun getCustomersAbsentOnSystem() {
        val customer = customerService.getCustomer(5)
        assertEquals(null, customer?.name, "Customer 5 not found on system")
    }
}