import { Component } from '@angular/core';

@Component({                            //these 4 lines are meta data attached to the class right below it
  selector: 'app-root',                 // this @Component tells angular that this is not any usual class its a component class
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {     
  title = 'My First Applicationhjhkjk';  
  
  public nameP="Prerna in component";
  public message="";

  myFirstMethod()
  {
    console.log("This is getting executed"); 
    this.title="MyApplication";
  }
}
