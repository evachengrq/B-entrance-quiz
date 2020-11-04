package com.thoughtworks.capability.gtb.entrancequiz;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
@AutoConfigureMockMvc
public class StudentsControllerTest {
    @Autowired
    MockMvc mockMvc;

//TODO GTB-测试: + 有一个测试，虽然只是测试了默认学员的数量。
    @Test
    void should_get_student_list() throws Exception {
        mockMvc.perform(get("/studentList"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(15)));
    }
}
