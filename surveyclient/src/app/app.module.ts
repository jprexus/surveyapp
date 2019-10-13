import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { SurveyListComponent } from './survey-list/survey-list.component';
import { SurveyFormComponent } from './survey-form/survey-form.component';
import { AppRoutingModule } from './app-routing/app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { SurveyService } from './service/survey.service';


@NgModule({
  declarations: [
    AppComponent,
    SurveyListComponent,
    SurveyFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [SurveyService],
  bootstrap: [AppComponent]
})
export class AppModule { }
