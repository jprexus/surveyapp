import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Survey } from '../model/survey';
import { SurveyService } from '../service/survey.service';

@Component({
  selector: 'app-survey-form',
  templateUrl: './survey-form.component.html',
  styleUrls: ['./survey-form.component.css']
})
export class SurveyFormComponent implements OnInit {

  survey: Survey;

  constructor(private route: ActivatedRoute, private router: Router, private surveyService: SurveyService) {
    this.survey = new Survey();
  }

  ngOnInit() {
  }

  onSubmit() {
    this.surveyService.save(this.survey).subscribe(result => this.gotoSurveyList());
  }
 
  gotoSurveyList() {
    this.router.navigate(['/surveys']);
  }

}
