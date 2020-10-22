package com.example.calculator_project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

//import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class CalculatorEndPintTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void helloApi() throws Exception {
        this.mockMvc.perform(get("/api"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("Hello from api: calculator_project!"));
    }

    @Test
    void add() throws Exception {
        this.mockMvc.perform(get("/api/add"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("5 + 5 = 10"));
    }

    @Test
    void subtract() throws Exception {
        this.mockMvc.perform(get("/api/subtract"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("15 - 5 = 10"));
    }
}
