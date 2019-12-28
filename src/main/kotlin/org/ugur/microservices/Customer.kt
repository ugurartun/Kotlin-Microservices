package org.ugur.microservices

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
data class Customer (var id : Int=0, var name :  String="", var telephone : Telephone? = null) 