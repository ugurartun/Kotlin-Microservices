package org.ugur.microservices.service

import org.ugur.microservices.model.Customer

interface CustomerService {

    fun getCustomer(id: Int): Customer?
    fun createCustomer(customer: Customer)
    fun deleteCustomer(id: Int)
    fun updateCustomer(id: Int, customer: Customer)
    fun getAllCustomers(): List<Customer>
}
