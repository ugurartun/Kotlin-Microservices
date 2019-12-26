package org.ugur.microservices

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.concurrent.ConcurrentHashMap

@RestController
class CustomerController {
    @Autowired
    lateinit var customers : ConcurrentHashMap<Int, Customer>

    @GetMapping(value = ["/customer/{id}"])
    fun getCustomer(@PathVariable id : Int) = customers[id]

    @GetMapping(value = ["/customers"])
    fun getCustomers() = customers.map(Map.Entry<Int, Customer>::value).toList()

    @PostMapping(value = ["/customer"])
    fun createCustomer(@RequestBody customer: Customer) {
        customers[customer.id] = customer
    }

    @DeleteMapping(value = ["/customer/{id}"])
    fun deleteCusotmer(@PathVariable id : Int) = customers.remove(id)


}
