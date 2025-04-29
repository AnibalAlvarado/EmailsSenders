import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from '../../environment/environment';

@Injectable({
  providedIn: 'root'
})
export class GeneralService {
  private baseUrl = environment.apiUrl; // ejemplo: http://localhost:8080/api/v1/emails

  constructor(private http: HttpClient) {}

  /**
   * Envía un correo basado en el tipo y el correo electrónico
   * @param type Tipo de correo (ej: newAccountEmail, forgotPasswordEmail)
   * @param email Dirección de correo destino
   */
  sendEmail(type: string, email: string): Observable<string> {
    return this.http.get<string>(`${this.baseUrl}/${type}/${email}`);
  }
}