package com.surveyshrike.surveyapp.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.surveyshrike.surveyapp.BackendApplicationConfig;
import com.surveyshrike.surveyapp.domain.SurveyBO;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BackendApplicationConfig.class)
public class SurveyControllerTest {

	@Autowired
	private SurveyController controller;

	private MockMvc mvc;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		this.mvc = MockMvcBuilders.standaloneSetup(this.controller).build();
		this.mvc.perform(MockMvcRequestBuilders.put("/v1/survey").content(getSurveyBO())
				.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON));
	}

	@Test
	public void getSurveysAPI() throws Exception {
		this.mvc.perform(MockMvcRequestBuilders.get("/v1/surveys").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
	}

	@Test
	public void createEmployeeAPI() {
		try {
			this.mvc.perform(MockMvcRequestBuilders.put("/v1/survey").content(getSurveyBO())
					.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))
					.andExpect(status().isCreated());
		} catch (final Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	public static String getSurveyBO() throws JsonProcessingException {
		final SurveyBO bo = new SurveyBO();
		bo.setUser("anand");
		bo.setEmail("pqr@abc.com");
		bo.setAttending(Boolean.TRUE);

		return new ObjectMapper().writeValueAsString(bo);
	}

}
