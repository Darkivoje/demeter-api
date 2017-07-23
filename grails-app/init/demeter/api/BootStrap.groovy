package demeter.api

import com.demeter.Farmland
import com.demeter.Job
import com.demeter.JobType
import com.demeter.Machine
import com.demeter.Person


class BootStrap {


    def init = { servletContext ->
        new JobType(name: 'Spremanje').save()
        new JobType(name: 'Oranje').save()
        new JobType(name: 'Prskanje').save()
        new JobType(name: 'Djubrenje').save()
        new JobType(name: 'Zalivanje').save()

        new Machine(make: "John Deer", model: "1200s", vin: "1234").save()
        new Machine(make: "John Deer", model: "1500rc", vin: "2234").save()
        new Farmland(name: "mirkova njiva", size: 43, number: 234554, location: "iza hetina").save()
        new Farmland(name: "Jovina zemlja", size: 98, number: 65453, location: "prema itebeju").save()
        new Person(firstname: "Kristian", lastname: "Kum", email: "some@mail.com", password: "123").save()

        new Job(
                description: "sredio sam kako valja",
                responsible: Person.get(1),
                jobType: JobType.get(2),
                farmland: Farmland.get(1),
                machines: [Machine.get(1), Machine.get(2)],
                startDate: new Date()
        ).save()

        new Job(
                description: "Zalio sve",
                responsible: Person.get(1),
                jobType: JobType.get(5),
                farmland: Farmland.get(2),
                machines: [Machine.get(2)],
                startDate: new Date()
        ).save()

    }

    def destroy = {
    }
}
