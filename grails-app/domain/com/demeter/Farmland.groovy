package com.demeter

import grails.rest.Resource

@Resource(uri='/farmland')
class Farmland {

    String name
    int size
    String number
    String location

    static constraints = {
        name nullable: false, blank: false
        size nullable: true, blank: true
        number nullable: false, blank: false
        location nullable: false, blank: false
    }
}
