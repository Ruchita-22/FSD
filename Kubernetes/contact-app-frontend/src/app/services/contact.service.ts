import { Injectable } from '@angular/core';

import { Contact } from '../contact';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ContactService {
  private contacts_api_url: string = `${environment.API}/api/v1/contacts`;

  constructor(private httpClient: HttpClient) {

  }

  addContact(contact: Contact): Observable<Contact> {
    return this.httpClient.post<Contact>(this.contacts_api_url, contact);
  }

  getAllContacts(): Observable<Contact[]> {
    return this.httpClient.get<Contact[]>(this.contacts_api_url);
  }
}
