package org.ugur.microservices.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.ugur.microservices.service.CustomerService
import org.ugur.microservices.exception.CustomerNotFoundException
import org.ugur.microservices.model.Customer

@RestController("/customers")
class CustomerController {
    @Autowired
    private lateinit var customerService: CustomerService

    @GetMapping("/{id}")
    fun getCustomer(@PathVariable id: Int): ResponseEntity<Customer> {
        val customer = customerService.getCustomer(id) ?: throw CustomerNotFoundException("customer '$id' not found")
        return ResponseEntity(customer, HttpStatus.OK)
    }

    @PostMapping
    fun createCustomer(@RequestBody customer: Customer): ResponseEntity<Unit> {
        customerService.createCustomer(customer)
        return ResponseEntity(Unit, HttpStatus.CREATED)
    }

    @DeleteMapping("/{id}")
    fun deleteCustomer(@PathVariable id: Int): ResponseEntity<Unit> {
        var status = HttpStatus.NOT_FOUND
        if (customerService.getCustomer(id) != null) {
            customerService.deleteCustomer(id)
            status = HttpStatus.OK
        }
        
        return ResponseEntity(Unit, status)
    }

    @PutMapping("/{id}")
    fun updateCustomer(@PathVariable id: Int, @RequestBody customer: Customer): ResponseEntity<Unit?> {
        var status = HttpStatus.NOT_FOUND
        if (customerService.getCustomer(id) != null) {
            customerService.updateCustomer(id, customer)
            status = HttpStatus.ACCEPTED
        }
        return ResponseEntity(Unit, status)
    }

    @GetMapping("/all")
    fun getCustomers(@PathVariable id: Int): List<Customer> {
        return customerService.getAllCustomers()
    }

}
