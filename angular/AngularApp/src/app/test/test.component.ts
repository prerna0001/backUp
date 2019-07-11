import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `<p>this is inline template </p>
             <h1 [class]="two">hi {{name}}</h1>
             <h1 class="one">{{"hello "+ name}}</h1>
             <br>{{aFunction()}}
             <br>{{siteUrl}} 
             <br>{{screenAvailHeight}}
             <br><input type="text" value="value field 1" />
             <br><input [id]="myId" bind-disabled="isDisabled" type="text" value="value field 2" />
             <p class="one"> its a paragrapgh with class="one"</p>
             <br><h2 [style.color]="'orange'">its style binding</h2>

             <br><h2 [style.color]="!hasError? 'magenta':'pink'">its trnery conditional style binding</h2>
             <br><button (click)="onClick($event)">click here</button>
             {{greeting}}
             <br><button (click)="hyp='hyper'">click here 2</button>
             {{hyp}}
             <br><input #myInput type="text"  />
             <button (click)="logMessage(myInput.value)">click here for log</button>
             <br><input [(ngModel)]="forTwoWay" type="text"/>
             {{forTwoWay}}

             <h2>{{"hello" + parentData}}</h2>
             <h2>{{"hello" + nm}}</h2>
             <br><button (click)="fireEvent()">click for Output</button>
             `,
  styles: [`
              p
              {
                color:red;
              }
              .one
              {
                color:green;
              }
               `]
})
export class TestComponent implements OnInit { // OnInit its a life cycle called by angular to indicate that component creation is done

  public name="Prerna Chauhan";
  public siteUrl= window.location.href;
  public screenAvailHeight= window.screen.availHeight;
  public myId= "its id";
  public isDisabled="true";
  public two="one";
  public greeting="";
  @Input() public parentData;
  @Input("parentData") public nm;
  @Output() public childEvent= new EventEmitter;

  fireEvent()
  {
    this.childEvent.emit("its bcoz of child event");
  }
  public onClick(event)
    {
      console.log("in consol greetings");
      this.greeting="page greetings";      

      console.log(event);
    }
  public forTwoWay="";
  logMessage(value)
  {
    console.log("welcome "+value);
  }  

  constructor() { }

  ngOnInit() {
  }
  aFunction()
  {
    return ("hellooo beeee "+ this.name);
  }
}
