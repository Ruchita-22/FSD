import { Component, OnInit } from '@angular/core';
import { Contact } from '../contact';
import {ContactService} from '../services/contact.service';

@Component({
  selector: 'app-contact-list',
  templateUrl: './contact-list.component.html',
  styleUrls: ['./contact-list.component.css']
})
export class ContactListComponent implements OnInit {
  public contact: Contact;
  public contactList: Contact[] = [];

  constructor(private contactService: ContactService) {
    this.contact = new Contact();
  }

  ngOnInit() {
    this.contactService.getAllContacts().subscribe(
      data =>{
        this.contactList = data;
      },
      error => {
        console.log(error.message);
      }
    );
  }

  addContact() {
    this.contactService.addContact(this.contact).subscribe(
      data => {
          console.log(data);
          this.contactList.push(data);
      },
      error =>{
        console.log(error);
      }
    )
    this.contact = new Contact();
  }

}
