package com.surveyshrike.surveyapp.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.surveyshrike.surveyapp.BackendApplicationConfig;
import com.surveyshrike.surveyapp.entity.Survey;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BackendApplicationConfig.class)
public class SurveyRepositoryTest {

	@Autowired
	private ISurveyRepository repository;

	@Test
	public void testSave() {
		final Survey entity = new Survey();
		entity.setUser("anand");
		entity.setAttending(Boolean.FALSE);
		entity.setReason("Busy with work");
		final Survey savedEntity = this.repository.save(entity);
		Assert.assertNotNull(savedEntity);
		Assert.assertNotNull(savedEntity.getId());
	}

	@Test
	public void testFindById() {
		final Survey entity = new Survey();
		entity.setUser("anand");
		entity.setAttending(Boolean.FALSE);
		entity.setReason("Busy with work");
		final Survey savedEntity = this.repository.save(entity);
		final Survey foundEntity = this.repository.findById(savedEntity.getId()).get();
		Assert.assertNotNull(foundEntity);
		Assert.assertEquals("Looks like the saved entity is not equal", savedEntity.getId(), foundEntity.getId());
		Assert.assertEquals("Looks like the saved entity is not equal", savedEntity.getUser(), foundEntity.getUser());
		Assert.assertEquals("Looks like the saved entity is not equal", savedEntity.isAttending(),
				foundEntity.isAttending());
		Assert.assertEquals("Looks like the saved entity is not equal", savedEntity.getReason(),
				foundEntity.getReason());
	}

}
