package com.demeter

import grails.rest.Resource

@Resource(uri='/jobType')

class JobType {

    String name
    static constraints = {
        name nullable: false, blank: false
    }
}
