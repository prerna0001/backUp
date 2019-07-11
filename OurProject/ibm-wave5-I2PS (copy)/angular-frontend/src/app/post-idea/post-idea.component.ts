import { Component, OnInit, ElementRef, ViewChild } from '@angular/core';
import {COMMA, ENTER} from '@angular/cdk/keycodes';
import {MatChipInputEvent} from '@angular/material/chips';
import {MatAutocompleteSelectedEvent, MatAutocomplete} from '@angular/material/autocomplete';
import {MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material/dialog';

import {Observable} from 'rxjs';
import {map, startWith} from 'rxjs/operators';
import { FormControl } from '@angular/forms';
import { PostIdeaServiceService } from '../post-idea-service.service';
import { Router } from '@angular/router';


export interface Domain {
  name: string;
} 

@Component({
  selector: 'app-post-idea',
  templateUrl: './post-idea.component.html',
  styleUrls: ['./post-idea.component.css']
})


export class PostIdeaComponent implements OnInit {

  visible = true;
  selectable = true;
  removable = true;
  addOnBlur = true;
  separatorKeysCodes: number[] = [ENTER, COMMA];
  domainCtrl = new FormControl();
  filteredDomains: Observable<string[]>;
  domains: string[] = [];
  allDomains: string[] = ['Software developer', 'Manual tester', 'Automation tester', 'Mobile developer',
                          'Marketing agent','Travel agent', 'Financer'];
  
  @ViewChild('domainInput', {static: false}) domainInput: ElementRef<HTMLInputElement>;
  @ViewChild('auto', {static: false}) matAutocomplete: MatAutocomplete;
  

  constructor(public dialogRef: MatDialogRef<PostIdeaComponent>, private postIdeaService : PostIdeaServiceService, private router: Router) {
    // console.log(this.matAutocomplete )
    this.filteredDomains = this.domainCtrl.valueChanges.pipe(
        startWith(null),
        map((domain: string | null) => domain ? this._filter(domain) : this.allDomains.slice()));
      // console.log(this.filteredDomains)
      this.filteredDomains.subscribe(console.log)
  }

  add(event: MatChipInputEvent): void {
    console.log(this.matAutocomplete.opened.emit())
    //  if (!this.matAutocomplete.isOpen) {
      const input = event.input;
      const value = event.value;
      
      
      if ((value || '').trim()) {
        this.domains.push(value.trim());
        console.log(this.domains, "this is add event")
      }
      
      if (input) {
        input.value = '';
      }
    }

  remove(domain: string): void {
    const index = this.domains.indexOf(domain);

    if (index >= 0) {
      this.domains.splice(index, 1);
    }
  }

  selected(event: MatAutocompleteSelectedEvent): void {
    // console.log(event, "SELECTED")
    this.domains.push(event.option.viewValue);
    // console.log
    this.domainInput.nativeElement.value = '';
    this.domainCtrl.setValue(null);
  }

  private _filter(value: string): string[] {
    const filterValue = value.toLowerCase();
    console.log(value+"123");
    return this.allDomains.filter(domain => domain.toLowerCase().indexOf(filterValue) === 0);
  }

  closeDialog() {
    this.dialogRef.close('Pizza!');
  }
  ngOnInit() {
    console.log(this.matAutocomplete)
  }

  postIdea(ideaTitle,ideaDomain,ideaSubDomain,ideaBio,ideaBudget,ideaRoles): any{
   
    console.log("hiiiiiiiiiii",ideaTitle,ideaDomain,ideaSubDomain,ideaBio,ideaBudget);
    console.log(this.domains)
    let Idea = {  
title : ideaTitle,
domain : ideaDomain,
subDomain : ideaSubDomain,
description : ideaBio,
budget : ideaBudget,
roles : this.domains
    }
    console.log("hellooooooooooooooooooooo");
    console.log(Idea);
    this.postIdeaService.postIdea(Idea);
    this.router.navigateByUrl('/xyz');
  }


}
