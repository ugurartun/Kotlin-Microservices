package org.ugur.microservices.repository

import org.springframework.data.repository.CrudRepository
import org.ugur.microservices.model.Customer

interface CustomerRepository : CrudRepository<Customer, Long> {
    fun findByName(name: String): List<Customer>
}
