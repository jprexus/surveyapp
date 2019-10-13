import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { Survey } from '../model/survey';

@Injectable()
export class SurveyService {

  private apiUrl: string;

  constructor(private http: HttpClient) {
    /**
    this.apiUrl = 'http://ec2-13-233-13-105.ap-south-1.compute.amazonaws.com/surveys';
     */
    this.apiUrl = 'http://localhost:10080/api/v1/';
  }
 
  public findAll(): Observable<Survey[]> {
    return this.http.get<Survey[]>(this.apiUrl + "surveys");
  }
 
  public save(survey: Survey) {
    return this.http.put<Survey>(this.apiUrl + "survey", survey);
  }

}
