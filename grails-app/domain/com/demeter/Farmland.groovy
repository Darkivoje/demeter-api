package com.demeter

import grails.rest.Resource

@Resource(uri='/farmland')
class Farmland {

    String name
    int size
    int number
    String location

    static constraints = {
        name nullable: false, blank: false
        size nullable: true, blank: true
        number nullable: true, blank: true
        location nullable: true, blank: true
    }
}
