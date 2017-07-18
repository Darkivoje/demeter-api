package com.demeter


import grails.rest.*

@Resource(uri='/machine')
class Machine {

    Integer workHours
    String plates
    String vin
    String make
    String model
    Date manufactured

    static constraints = {
        vin nullable: false, blank: false, unique: true
        make nullable: false, blank: false
        model nullable: false, blank: false
        workHours nullable: true, blank: true
        plates nullable: true, blank: true
        manufactured nullable: true, blank: true
    }

}