package com.surveyshrike.surveyapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surveyshrike.surveyapp.domain.SurveyBO;
import com.surveyshrike.surveyapp.domain.SurveyBOBuilderHelper;
import com.surveyshrike.surveyapp.entity.Survey;
import com.surveyshrike.surveyapp.repository.ISurveyRepository;
import com.surveyshrike.surveyapp.service.ISurveyService;

@Service
public class SurveyServiceImpl implements ISurveyService {

	@Autowired
	private ISurveyRepository surveyRepository;

	@Override
	public SurveyBO save(SurveyBO surveyBO) {
		final Survey entity = this.surveyRepository.save(SurveyBOBuilderHelper.build(surveyBO));
		return SurveyBOBuilderHelper.build(entity);
	}

	@Override
	public List<SurveyBO> findAll() {
		return SurveyBOBuilderHelper.build(this.surveyRepository.findAll());
	}
}
