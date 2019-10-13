package com.surveyshrike.surveyapp.service;

import java.util.List;

import com.surveyshrike.surveyapp.domain.SurveyBO;

public interface ISurveyService {

	SurveyBO save(SurveyBO surveyBO);

	List<SurveyBO> findAll();

}
