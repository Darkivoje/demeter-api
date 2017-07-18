package com.demeter

import grails.rest.Resource

@Resource(uri='/person')

class Person {

    String firstname
    String lastname
    String phone
    String address
    String email
    String password

    static constraints = {
        firstname blank: false
        lastname blank: false
        phone nullable: true, blank: true
        address nullable: true, blank: true
        email blank: false
        password blank: false
    }
}
