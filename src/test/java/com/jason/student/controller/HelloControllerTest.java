package com.jason.student.controller;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


/**
 * @author jason
 * @date 2019-05-05  20:03:12
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class HelloControllerTest {
   private MockMvc mockMvc;

   private Logger logger = LoggerFactory.getLogger(HelloControllerTest.class);

   @Before
   public void setUp(){
       mockMvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
   }

   @Test
    public void testSayHi() throws Exception{
      String responseStr =  mockMvc.perform(MockMvcRequestBuilders.get("/hi")
               .accept(MediaType.APPLICATION_JSON))
               .andExpect(MockMvcResultMatchers.status().isOk())
               .andDo(MockMvcResultHandlers.print())
               .andReturn().getResponse().getContentAsString();

       System.out.println("====== responseStr = " + responseStr);
       logger.info("======>>> responseStr = " + responseStr);
   }

   @Test
   @Ignore("not ready yet")
    public void test(){
        System.out.println("===========  just test");
    }

    @Test
    public void test2(){
        System.out.println("===========  just test222");
    }
}