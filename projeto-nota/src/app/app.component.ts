import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  opened:boolean = false;

  title = 'projeto-nota';

  constructor() {}

  ngOnInit(): void {

  }

  showSidebar() {
    this.opened = !this.opened;
  }

}

