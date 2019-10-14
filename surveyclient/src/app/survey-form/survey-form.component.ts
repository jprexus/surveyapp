import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Survey } from '../model/survey';
import { SurveyService } from '../service/survey.service';
import { AuthService, GoogleLoginProvider } from 'angular4-social-login';

@Component({
  selector: 'app-survey-form',
  templateUrl: './survey-form.component.html',
  styleUrls: ['./survey-form.component.css']
})
export class SurveyFormComponent implements OnInit {

  survey: Survey;
  user: any;

  constructor(private route: ActivatedRoute, private router: Router, private surveyService: SurveyService, private authService: AuthService ) {
    this.survey = new Survey();
  }

  ngOnInit() {
    this.authService.authState.subscribe((user) => {
      if(user !=null){
        this.survey.user = user.name;
        this.survey.email = user.email;
      }
      this.user=user;
    });
  }

  onSubmit() {
    this.surveyService.save(this.survey).subscribe(result => this.gotoSurveyList());
  }
 
  gotoSurveyList() {
    this.router.navigate(['/surveys']);
  }

}
