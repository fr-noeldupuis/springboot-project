package fr.noeldupuis.springbootproject.controller

import org.junit.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*
import org.springframework.test.web.servlet.MockMvc
import spock.lang.Specification

@AutoConfigureMockMvc
@WebMvcTest
class HelloWorldControllerE2ETest extends Specification {

    @Autowired
    private MockMvc mvc

    @Test
    def "Test that the greeting message sent back is status 200"() {
        expect: "Status is 200 and the response is 'Hello world!'"
        mvc.perform(get("/"))
                .andExpect(status().isOk())

    }
    @Test
    def "Test that the greeting message sent back from root url is right"() {
        expect: "Status is 200 and the response is 'Hello world!'"
        mvc.perform(get("/"))
        .andReturn()
          .response
          .contentAsString == "{\"message\":\"Hello World!\"}"

    }
}