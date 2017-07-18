package demeter.api

import com.demeter.Farmland
import com.demeter.Job
import com.demeter.Machine
import com.demeter.Person

class BootStrap {

    def init = { servletContext ->
        new Machine(make: "John Deer", model: "1200s", vin: "1234").save()
        new Machine(make: "John Deer", model: "1500rc", vin: "2234").save()
        new Farmland(name: "mirkova njiva", size: 43, number: 234554, location: "iza hetina").save()
        new Farmland(name: "Jovina zemlja", size: 98, number: 65453, location: "prema itebeju").save()
        def per = new Person(firstname: "Darko", lastname: "Rajin").save()

        new Job(
                description: "oranje", responsible: [Person.get(1)]
        ).save()
    }

    def destroy = {
    }
}
