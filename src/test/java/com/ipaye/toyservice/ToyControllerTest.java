package com.ipaye.toyservice;


import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ToyControllerTest {


    @Autowired
    private MockMvc mockMvc;

    @Test
    void ShouldAddToyToBox() throws Exception {
       mockMvc.perform(post("/toys")
               .content("{\"name\":\"Teddy Bear\"}")
               .contentType("application/json"))
               .andExpect(status().isOk());
    }

    @Test
    void shouldListAllToys() throws Exception {
        mockMvc.perform(get("/toys"))
                .andExpect(status().isOk())
                .andExpect(content().json("[]")); // Expect empty array at first
    }


    @Test
    void shouldReceiveOrderForToys() throws Exception {
        mockMvc.perform(get("/toys")
                .content("{\"name\":\"Teddy Bear\":\"Micky Mouse\"}")
                .contentType("application/json"))
                .andExpect(status().isOk());
    }

    @Test
    void shouldSellToyS() throws Exception {
        mockMvc.perform(post("/toys")
                .content("{\"name\":\"Teddy Bear\", \"type\":\"Micky Mouse\"}")
                        .contentType("application/json"))
                .andExpect(status().isOk());
    }

    @Test
    void shouldBuyMoreToys() throws Exception{
        mockMvc.perform(get("/toys")
                .content("{\name\":\"Gun\",\"type\":\"Water Gun\"}")
                .contentType("application/json"))
                .andExpect(status().isOk());
    }

    @Test
    void shouldSellOldToys() throws Exception {
        mockMvc.perform(get("/toys")
                .content("{\name\":\"Canoe\",\"Color\":\"Yellow\"}")
                .contentType("application/json"))
                .andExpect(status().isOk());
    }

}
