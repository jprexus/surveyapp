package com.surveyshrike.surveyapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.surveyshrike.surveyapp.domain.SurveyBO;
import com.surveyshrike.surveyapp.service.ISurveyService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Survey Controller with Get and Put methods
 *
 * @author anandpillai
 *
 */
@RestController
@CrossOrigin
public class SurveyController {

	@Autowired
	private ISurveyService surveyService;

	@ApiOperation(value = "Get All Surveys", response = List.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "All Survey Responses", response = List.class),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@GetMapping("/surveys")
	public List<SurveyBO> getSurveys() {
		// Find all surveys
		return this.surveyService.findAll();
	}

	@ApiOperation(value = "Post a Survey")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Successfully posted a Survey"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@PutMapping("/surveys")
	public ResponseEntity<SurveyBO> addSurvey(@RequestBody SurveyBO surveyBO) {
		this.surveyService.save(surveyBO);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	public ISurveyService getSurveyService() {
		return this.surveyService;
	}

	public void setSurveyService(final ISurveyService surveyService) {
		this.surveyService = surveyService;
	}

}
