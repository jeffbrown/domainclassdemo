package gormdemo

import groovy.util.logging.Slf4j
import org.grails.orm.hibernate.HibernateDatastore

@Slf4j
class PersonDemo {
    static void main(args) {
        Map configuration = [
                'hibernate.hbm2ddl.auto': 'create-drop',
                'dataSource.url'        : 'jdbc:h2:mem:myDB'
        ]
        new HibernateDatastore(configuration, Person)

        Person.withNewSession {
            new Person(firstName: 'Jake', lastName: 'Brown').save()
            new Person(firstName: 'Zack', lastName: 'Brown').save()
            def people = Person.list()
            for (Person p : people) {
                log.info "${p.lastName}, ${p.firstName}"
            }
        }
    }
}
