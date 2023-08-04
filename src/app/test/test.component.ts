import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {
  ngOnInit(){

  }
  onClickSubmit(result:any) {
    console.log("You have entered : " + result.username);
 }

}
