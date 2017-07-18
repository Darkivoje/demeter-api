package com.demeter

import grails.rest.Resource

@Resource(uri='/job')

class Job {

    Date startDate
    Integer workHours
    String description
    String code
    Farmland farmland
    static hasMany = [responsible: Person,
                      machines   : Machine]

    static constraints = {
        startDate nullable: true
        workHours nullable: true
        description nullable: false, blank: false
        farmland nullable: false, blank: false
        code nullable: true, blank: true
        responsible validator: { val, obj ->
            def retval = true
            if (!obj?.responsible?.size()) {
                retval = 'job.validator.hasnoresponsible.error'
            }
            return retval
        }
    }
}
