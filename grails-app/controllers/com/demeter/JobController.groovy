package com.demeter

import grails.converters.JSON
import grails.rest.RestfulController

class JobController extends RestfulController {

    JobController() {
        super(Job)
    }

    @Override
    protected Job queryForResource(Serializable id) {
        Job.where {
            id == id
        }.find()
    }

    def index() {
        JSON.use('deep')
        render Job.getAll() as JSON
    }

    def show(Job job) {
        JSON.use('deep')
        render job as JSON
    }

}
