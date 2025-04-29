import { Component } from '@angular/core';
import { MatIconModule } from '@angular/material/icon';
import { MatSelectModule } from '@angular/material/select';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatButtonModule } from '@angular/material/button';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { GeneralService } from '../../services/general.service';

@Component({
  selector: 'app-form-type-email',
  imports: [ CommonModule,MatFormFieldModule, MatInputModule, MatSelectModule, MatButtonModule, MatIconModule, ReactiveFormsModule],
  templateUrl: './form-type-email.component.html',
  styleUrl: './form-type-email.component.scss'
})
export class FormTypeEmailComponent {
  emailForm: FormGroup;
  emailTypes = [
    { value: 'newAccountEmail', label: 'Nueva Cuenta' },
    { value: 'forgotPasswordEmail', label: 'Olvidé mi Contraseña' },
    { value: 'activationEmailWithCode', label: 'Activación con Código' },
    { value: 'changedPasswordNotification', label: 'Contraseña Cambiada' },
    { value: 'lockStockNotification', label: 'Stock Bloqueado' },
    { value: 'purchaseNotification', label: 'Notificación de Compra' },
  ];

  constructor(private fb: FormBuilder, private generalService: GeneralService) {
    this.emailForm = this.fb.group({
      email: ['', [Validators.required, Validators.email]],
      type: ['', Validators.required],
    });
  }

  sendEmail() {
    if (this.emailForm.valid) {
      const email = this.emailForm.value.email;
      const type = this.emailForm.value.type;
      
      this.generalService.sendEmail(type, email).subscribe({
        next: (res) => alert(res),
        error: (err) => console.error('Error al enviar el correo:', err)
      });
    }
  }
}
