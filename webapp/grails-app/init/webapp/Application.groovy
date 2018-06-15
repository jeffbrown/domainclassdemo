package webapp

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration

class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
        GrailsApp.run(Application, args)
    }

    @Override
    protected boolean limitScanningToApplication() {
        false
    }

    @Override
    Collection<String> packageNames() {
        super.packageNames() + ['gormdemo']
    }
}