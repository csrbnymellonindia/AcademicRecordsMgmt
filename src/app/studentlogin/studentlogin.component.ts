import { Component } from '@angular/core';
import { Input } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';
@Component({
  selector: 'app-studentlogin',
  templateUrl: './studentlogin.component.html',
  styleUrls: ['./studentlogin.component.css']
})
export class StudentloginComponent {
  @Input() placeholder?:String = 'Student Identifier'
  @Input() submiturl?:String = 'studentprofile'

  username: string = '';
  password: string = '';
  errorMessage: string = ''; // To hold the error message

  constructor(private authService: AuthService, private router: Router) { }

  login(): void {
    console.log('Attempting login...');
    if (this.authService.login(this.username, this.password)) {
      console.log('Login successful!');
      // Login successful, navigate to the dashboard
      this.router.navigate(['/studentprofile']);
    } else {
      console.log('Login failed.');
      // Set the error message to be displayed in the template
      this.errorMessage = 'Invalid username or password';
    }
  }
}
