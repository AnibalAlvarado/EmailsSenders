import { Routes } from '@angular/router';
import { FormTypeEmailComponent } from './component/form-type-email/form-type-email.component';

export const routes: Routes = [

    { path: 'inicio', component: FormTypeEmailComponent },
    { path: '', redirectTo: 'inicio', pathMatch: 'full' },
    { path: '**', redirectTo: 'inicio' }
];
