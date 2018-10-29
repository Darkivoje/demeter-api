package com.demeter

import grails.rest.Resource

@Resource(uri='/job')

class Job {

    Date startDate
    String description
    JobType jobType
    Farmland farmland
    Person responsible
    static hasMany = [machines: Machine]
    List machines

    static mapping = {
        machines lazy: false
    }

    static constraints = {
        startDate nullable: true
        description nullable: true
        farmland nullable: false, blank: false
        jobType nullable: true
        responsible nullable: false
    }
}
