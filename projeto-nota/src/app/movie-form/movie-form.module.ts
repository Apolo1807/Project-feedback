import { MovieFormComponent } from './movie-form.component';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { FormsModule } from '@angular/forms'

@NgModule({
  declarations: [
    MovieFormComponent
  ],
  imports: [
    CommonModule,
    FormsModule
  ],
  exports: [
    MovieFormComponent
  ]
})
export class AdicionarFilmeModule { }
