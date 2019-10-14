import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SurveyListComponent } from '../survey-list/survey-list.component';
import { SurveyFormComponent } from '../survey-form/survey-form.component';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  { path: 'surveys', component: SurveyListComponent },
  { path: 'addsurvey', component: SurveyFormComponent }
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule],
  declarations: []
})
export class AppRoutingModule { }
