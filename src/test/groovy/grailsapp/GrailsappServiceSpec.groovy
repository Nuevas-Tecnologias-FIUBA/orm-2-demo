package grailsapp

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class GrailsappServiceSpec extends Specification implements ServiceUnitTest<GrailsappService>{

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
