import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { SurveyListComponent } from './survey-list/survey-list.component';
import { SurveyFormComponent } from './survey-form/survey-form.component';
import { AppRoutingModule } from './app-routing/app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { SurveyService } from './service/survey.service';
import { SocialLoginModule, AuthServiceConfig, GoogleLoginProvider } from 'angular4-social-login';

let config = new AuthServiceConfig([
  {
    id: GoogleLoginProvider.PROVIDER_ID,
    provider: new GoogleLoginProvider('161278919223-dhv6bncuuvk3lud2tucj2qrg0if4ji99.apps.googleusercontent.com')
  }
]);
export function provideConfig() {
  return config;
}

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
    FormsModule,
    SocialLoginModule
  ],
  providers: [
    {
      provide: AuthServiceConfig,
      useFactory: provideConfig
    },
    SurveyService,
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
