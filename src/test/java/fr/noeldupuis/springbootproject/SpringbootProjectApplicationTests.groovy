package fr.noeldupuis.springbootproject

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

import fr.noeldupuis.springbootproject.controller.HelloWorldController
import spock.lang.Specification

@SpringBootTest
class LoadContextTest extends Specification {

    @Autowired
    private HelloWorldController webController

    def "when context is loaded then all expected beans are created"() {
        expect: "the WebController is created"
        webController
    }
}
