package com.surveyshrike.surveyapp.domain;

import java.util.ArrayList;
import java.util.List;

import com.surveyshrike.surveyapp.entity.Survey;

public class SurveyBOBuilder {

	public static SurveyBO build(Survey entity) {
		final SurveyBO bo = new SurveyBO();
		bo.setId(entity.getId());
		bo.setUser(entity.getUser());
		bo.setAttending(entity.isAttending());
		bo.setReason(entity.getReason());
		return bo;
	}

	public static Survey build(SurveyBO bo) {
		if (bo.getId() == null) {
			final Survey entity = new Survey();
			entity.setUser(bo.getUser());
			entity.setAttending(bo.isAttending());
			entity.setReason(bo.getReason());
			return entity;
		}
		return null;
	}

	public static List<SurveyBO> build(Iterable<Survey> entities) {
		final List<SurveyBO> bos = new ArrayList<SurveyBO>();
		entities.forEach(e -> bos.add(build(e)));
		return bos;
	}

}
