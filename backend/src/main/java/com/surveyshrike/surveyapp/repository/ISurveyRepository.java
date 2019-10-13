package com.surveyshrike.surveyapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.surveyshrike.surveyapp.entity.Survey;

/**
 * Survey Repository. No need for additional methods as of 14 Oct 2019
 * 
 * @author anandpillai
 *
 */
@Repository
public interface ISurveyRepository extends CrudRepository<Survey, Long> {

}
