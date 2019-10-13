package com.surveyshrike.surveyapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.surveyshrike.surveyapp.domain.SurveyBO;
import com.surveyshrike.surveyapp.service.ISurveyService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

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
		return this.surveyService.findAll();
	}

	@PostMapping("/surveys")
	public void addSurvey(@RequestBody SurveyBO surveyBO) {
		this.surveyService.save(surveyBO);
	}

}
