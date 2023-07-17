import { Component } from '@angular/core';
import { Input } from '@angular/core';


@Component({
  selector: 'app-student-profile',
  templateUrl: './student-profile.component.html',
  styleUrls: ['./student-profile.component.css']
})
export class StudentProfileComponent {
  @Input() name?:String = 'Team 17'
  @Input() class?:String = 'TSG'
  @Input() rollno?:String = '757858273'

  showresult:boolean = false;

  showResult():void{
    this.showresult = !this.showresult
  }
}
