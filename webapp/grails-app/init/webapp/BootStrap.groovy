package webapp

import gormdemo.Person

class BootStrap {

    def init = { servletContext ->
        new Person(firstName: 'Jake', lastName: 'Brown').save()
        new Person(firstName: 'Zack', lastName: 'Brown').save()
    }
    def destroy = {
    }
}
