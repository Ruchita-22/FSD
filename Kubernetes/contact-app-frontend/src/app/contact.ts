import { EmailValidator } from '@angular/forms';

export class Contact {

    // public id: number;

    constructor(
        public name?: string,
        public email?: string,
        public mobile?: string,
        public category?: string) {

    }
}
