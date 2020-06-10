package org.ugur.microservices.model

import com.fasterxml.jackson.annotation.JsonInclude
import org.ugur.microservices.model.Telephone

@JsonInclude(JsonInclude.Include.NON_NULL)
data class Customer(var id: Int = 0, var name: String = "", var telephone: Telephone? = null)
