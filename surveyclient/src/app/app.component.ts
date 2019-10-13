import { Component } from '@angular/core';
import { AuthService, GoogleLoginProvider } from 'angular4-social-login';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Survey Strike - Invitation to attend ceremony!!!';
  user: any;
 
  constructor(private authService: AuthService) { }
 
  // Method to sign in with google.
  signIn(platform : string): void {
    platform = GoogleLoginProvider.PROVIDER_ID;
    this.authService.signIn(platform).then(
      (response) => {
        console.log(platform + " logged in user data is= " , response);
        this.user = response;
      }
    );
  }
 
  // Method to log out.
  signOut(): void {
    this.authService.signOut();
    this.user = null;
    console.log('User signed out.');
  }
}
