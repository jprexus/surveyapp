package com.surveyshrike.surveyapp.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.surveyshrike.surveyapp.BackendApplicationConfig;
import com.surveyshrike.surveyapp.domain.SurveyBO;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BackendApplicationConfig.class)
public class SurveyServiceTest {

	@Autowired
	private ISurveyService surveyService;

	@Test
	public void testSave() {
		final SurveyBO bo = new SurveyBO();
		bo.setUser("Anand");
		bo.setAttending(Boolean.TRUE);
		bo.setReason("Happy to attend");
		final SurveyBO savedBO = this.surveyService.save(bo);
		Assert.assertNotNull(savedBO);
		Assert.assertNotNull(savedBO.getId());
	}

}
