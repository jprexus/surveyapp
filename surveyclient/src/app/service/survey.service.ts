import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { Survey } from '../model/survey';

@Injectable()
export class SurveyService {

  private surveysUrl: string;

  constructor(private http: HttpClient) {
    this.surveysUrl = 'http://localhost:10080/surveys';
  }
 
  public findAll(): Observable<Survey[]> {
    return this.http.get<Survey[]>(this.surveysUrl);
  }
 
  public save(survey: Survey) {
    return this.http.post<Survey>(this.surveysUrl, survey);
  }

}
