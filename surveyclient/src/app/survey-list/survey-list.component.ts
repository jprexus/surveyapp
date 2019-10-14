import { Component, OnInit } from '@angular/core';
import { Survey } from '../model/survey';
import { SurveyService } from '../service/survey.service';

@Component({
  selector: 'app-survey-list',
  templateUrl: './survey-list.component.html',
  styleUrls: ['./survey-list.component.css']
})
export class SurveyListComponent implements OnInit {

  surveys: Survey[];

  constructor(private surveyService:SurveyService) { }

  ngOnInit() {
    this.surveyService.findAll().subscribe(data => {
      this.surveys = data;
    })
  }

}
