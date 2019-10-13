package com.surveyshrike.surveyapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.surveyshrike.surveyapp.entity.Survey;

@Repository
public interface ISurveyRepository extends CrudRepository<Survey, Long> {

}
