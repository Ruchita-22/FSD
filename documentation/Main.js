
<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Page Title</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='main.css'>
    <script src='main.js'></script>
    <script>
        // alert("test javascript")
        console.log("javascript")
        function sum(num1,num2) {
            console.log(city)
            return num1 + num2;
        }
        console.log(sum(100,200))
        var city = prompt("enter city") //to take a input from a user
        console.log("city: " + city)
    </script>
</head>
<body>
        <h1 style="background-color: lightblue;"> Head element </h1>
</body>
</html>

===================================================================================================
Form Validation

<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Page Title</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='main.css'>
    <script src='main.js'></script>
    <script>
        function validate() {
            if(uname.value == "admin")
                console.log("valid user")
            else
                console.log("invalid")
        }
    </script>
</head>
<body>
         User Name: <input type="text" id="uname" /> <br />
         Password: <input type="password" id="pass" /> <br />
         <button onclick="validate()"> Click </button>
</body>
</html>

====================================================================================
Array in loop
----------
let names = ["ram","sachin","manjunath","mahesh"]
for(i=0; i < names.length; i++)
    console.log(names[i])
//for each enchaned loop
for(let n in names)
    document.write("<h1> " + names[n] + "<h1>")

=====================================================================================

SR-Janakiram  12:15 PM
https://developer.mozilla.org/en-US/docs/Web/JavaScript
developer.mozilla.orgdeveloper.mozilla.org
JavaScript | MDN
JavaScript (JS) is a lightweight, interpreted, or just-in-time compiled programming language with first-class functions. While it is most well-known as the scripting language for Web pages, many non-browser environments also use it, such as Node.js, Apache CouchDB and Adobe Acrobat. JavaScript is a prototype-based, multi-paradigm, single-threaded, dynamic language, supporting object-oriented, imperative, and declarative (e.g. functional programming) styles. Read more about JavaScript.
https://developer.mozilla.org/en-US/docs/Web/JavaScript


=============================================================================
Array Inbuild functions
------------------
let names = ["ram","sachin","manjunath","mahesh"]
console.log(names)
console.log(names.sort())
names.forEach(name => {
    console.log(name)
})
let m = [];
m = names.map(name => name.toUpperCase());
console.log(m)
m = names.filter(name => name.startsWith('m'))
console.log(m)

let count = names.reduce( (accumlator,name) => {
    if(name.startsWith('m'))
         accumlator+=1
    return accumlator;
},0)
console.log(count)

SR-Janakiram  12:38 PM
https://nodejs.org/en/download/
Node.jsNode.js
Download | Node.js
Node.js® is a JavaScript runtime built on Chrome's V8 JavaScript engine.
12:39
https://gitlab-ibm.stackroute.in/stack_js/javascript-basics-assignment
GitLabGitLab
Sign in
Gitlab for StackRoute Remote Program - IBM Employees only!

===========================================================================================
class-2
-----------
<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Page Title</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='main.css'>
    <script src='main.js'></script>
</head>
<body>
        <h1 id="element1"> DOM Object </h1>
        <script>
            document.getElementById("element1").outerHTML ="<u> Html </u>"
        </script>
</body>
</html>

===========================================================================================
<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Page Title</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='main.css'>
    <script src='main.js'></script>
    <style>
        .x {color:red}
    </style>
</head>
<body>
        <h1 onmouseover="change()" id="h2"> CSS DOM </h1>
        <h2 onmouseover="change1()" id="h1"> CSS class selector </h2>
        <script>
            function change() {
                document.getElementById("h2").style.color = "lightblue"
            }
            function change1() {
                   h1.className = "x"
            }
        </script>
</body>
</html>
===============================================================================
let name = "raviram"
console.log(name.toUpperCase())
console.log(name.substring(2,5))
let dt = new Date();
console.log(dt)
console.log(dt.getDay() + "-" + dt.getMonth() + "-" + dt.getFullYear())

SR-Janakiram  11:57 AM
<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Page Title</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='main.css'>
    <script src='main1.js'></script>
</head>
<body>
        <button onclick="history.back()"> Back </button>
        <button onclick="history.forward()"> Forward </button>
        <select id="retail" onchange="change()">
            <option value="a">Amazon</option>
            <option value="f">Flipkart</option>
            <option value="n">No Select</option>
        </select>
        <script>
                function change() {
                     if(document.getElementById("retail").value == "a")
                        location.href="http://www.amazon.com"
                     else if(document.getElementById("retail").value == "f")
                        location.href="http://www.flipkart.com"
                }
        </script>
</body>
</html>
Flipkart.com
Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!
Shop for electronics, apparels & more using our Flipkart app Free shipping & COD.

SR-Janakiram  12:14 PM
let customer = {
    name: "ravi",
    email: "ravi@gmail.com",
    display: function() {
        console.log("Name: " + this.name)
        console.log("Email: " + this.email)
    }
}
customer.display()

SR-Janakiram  12:23 PM
function emp(name,address) {
    this.name = name;
    this.address = address;
    this.print = () => {
        return `${this.name} , ${this.address}`
    }
}
let obj = new emp("ravi","bng")
console.log(obj.print())
console.log(obj)
console.log(typeof(obj))

SR-Janakiram  12:31 PM
class supplier {
    constructor(name,city) {
        this.name = name;
        this.city = city
    }
    getSupplierDetails() {
        return `${this.name} , ${this.city}`
    }
}
let sobj = new supplier("ram","mys")
console.log(sobj.getSupplierDetails())
sobj = new supplier("sachin","chn")
console.log(sobj.getSupplierDetails())

SR-Janakiram  12:46 PM
//super
class Test {
    constructor(name) {
        this.name = name
    }
    getTest() {
        return this.name
    }
}
//sub
class Test1 extends Test {
    constructor(name,address){
        super(name)
        this.address = address
    }
    getTest1() {
        return this.getTest() + ',' + this.address
    }
}
let obj1 = new Test1("ravi","bng")
console.log(obj1.getTest1())
================================================================
Clsses concept
----------------------------
SR-Janakiram  11:38 AM
console.log("Hi")
class Test {
    constructor(name){
        this.name = name;
    }
    getName() {
        return this.name;
    }
    setName(uname)
    {
        if(uname === '')
            throw 'the name cant be empty'
        this.name = uname
    }
}
let obj = new Test("ram")
console.log(obj.getName())
obj.setName("")
console.log(obj.getName())

===========================================================================
Inheritance
class Test {
    constructor(num1){
        this.num1 = num1
    }
    display() {
        console.log("num1: " + this.num1)
    }
}
class Test1 extends Test {
    constructor(num2) {
        super(num2)
        this.num2 = num2
    }
    display() {
        super.display()
        console.log("num2: " + this.num2)
    }
    static test() {
        console.log("static")
    }
}
let obj = new Test1(20)
obj.display()
Test1.test()
=====================================================================
Array
---------------

let arr = [10,20,30,40,50]
//iterator
for(let a of arr)
    console.log(a)
Set
-----------------
let roles = new Set();
  roles.add("admin")
  roles.add("guest")
  roles.add("finance")
  roles.add("guest")
for(let role of roles)
    console.log(role)
roles.delete("admin")
for(let role of roles)
    console.log(role)
Map
--------------------
let emp = new Map(
    [
        [101,"ram"],
        [102,"sachin"],
        [103,"anthony"]
    ]
)
emp.set(104,"mahesh")
for(let k of emp.keys())
    console.log(k)
for(let v of emp.values())
    console.log(v)
console.log(emp.keys())
console.log(emp.get(102))
let e = emp.entries()
for(i=0;i<emp.size;i++)
    console.log(e.next().value)
=====================================================================

SR-Janakiram  12:21 PM
Notes.txt 
HTML5, CSS3, Bootstrap 
  for designing static web pages - HTML 5
  CSS 3 - styling the content 
  Bootstrap - responsive web pages     
Click to expand inline (98 lines)


Pinned by sneha Deotale

Shweta Gupta  12:27 PM
https://stackbooks-ibm.stackroute.in/course/Building-Responsive-and-Interactive-Web-Pages/index
GitLabGitLab
Sign in
Gitlab for StackRoute Remote Program - IBM Employees only!

Abdul Sharique Qureshi  11:25 AM
Hi Janaki,
11:25
I won't be able to  join today's session due to project deliverables
====================================================================================
Fetch Api 17th March
------------------

<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Page Title</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='main.css'>
    <script src='main.js'></script>
    <script>
function callr() {
  return new Promise(resolve => {
    setTimeout(() => {
      resolve('calling promise');
    }, 3000);
  });
}
async function funCall() {
  console.log('calling function');
  var result = await callr();
  console.log(result);
}
funCall();
</script>
</head>
<body>
</body>
</html>
==============================================================
<html>
<script>
class Person {
  constructor(first, last, age, gender, interests) {
    this.name = {
      first,
      last
    };
    this.age = age;
    this.gender = gender;
    this.interests = interests;
  }
  async greeting() {
    return await Promise.resolve(`Hi! I'm ${this.name.first}`);
  };
  farewell() {
    console.log(`${this.name.first} has left the building. Bye for now!`);
  };
}
let han = new Person('Han', 'Solo', 25, 'male', ['Smuggling']);
han.greeting().then(console.log);
han.farewell();
async function hello() {
  return greeting = await Promise.resolve("Hello");
};
hello().then(alert);
</script>
</html>

========================================================================================
https://www.npmjs.com/package/json-server
npmnpm
json-server
Get a full fake REST API with zero coding in less than 30 seconds. Latest version: 0.17.0, last published: 5 months ago. Start using json-server in your project by running npm i json-server. There are 262 other projects in the npm registry using json-server.
11:55
Zip 

FetchAPI.zip
ZipDownload Zip


Pinned by sneha Deotale

SR-Janakiram  12:28 PM
https://gitlab-ibm.stackroute.in/stack_js/javascript-movie-cruiser-assignment
GitLabGitLab
Sign in
Gitlab for StackRoute Remote Program - IBM Employees only!

SR-Janakiram  12:35 PM
http://localhost:3000/cadets


=========================================================================
31st march
==========
import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Student } from './student';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class Test1Service {
  constructor(private http:HttpClient) { }
  getDate() {
    return new Date();
  }
  getStudentDetails(): Observable<Array<Student>> {
    return this.http.get<Array<Student>>('http://localhost:3000/student');
   }
}
12:11
------------------------------
export class Student {
    public id:number;
    public name:string;
    public address:string
    constructor() {
        this.id = 0;
        this.name = '';
        this.address = '';
    }
}
12:12
----------------------------------
stud:Student = new Student();
  studentDetails: Array<Student> = [];
  ngOnInit(): void {
    this.stud = new Student();
      this.test1.getStudentDetails().subscribe(
        data => {
          console.log(data);
          this.studentDetails = data;
        },
        error => {
          console.log(error.message);
        }
      );
  }
12:14
----------------------------------------------
{
    "student":
    [
        {
            "id":1,
            "name":"ram",
            "address":"bng"
        },
        {
            "id":2,
            "name":"ravi",
            "address":"mys"
        }
    ]
}

SR-Janakiram  12:20 PM
------------------------------------
<div>
    <li *ngFor="let s of studentDetails">
           {{s.id}} , {{s.name}} | {{s.address}}
    </li>
</div>

SR-Janakiram  12:37 PM
-------------------------------
<section>
    <mat-card *ngFor="let s of studentDetails">
        <mat-card-title>{{s.id}}</mat-card-title>
        <mat-card-content>
            {{s.name}} , {{s.address}}
        </mat-card-content>
    </mat-card>
</section>
=======================================================================
SR-Janakiram  11:26 AM
template form
============
<form #login = "ngForm" (ngSubmit)="onClick(login.value)">
    <input type=text name="name" placeholder="enter name" ngModel>
    <br />
    <input type=text name="address" placeholder="enter address" ngModel>
    <br />
    <input type=submit value=click>
    <br />
</form>

SR-Janakiram  11:52 AM
reactive form
=============
<div class="form-container">
    <form [formGroup]="loginform" (ngSubmit)="loginSubmit()">
        <label>Name: </label>
        <input type="text" [formControl]="name">
            <div *ngIf="name.invalid && (name.dirty || name.touched)">
                <div *ngIf="name.errors.requried" class="alert alert-danger">
                       Name is requried.
                </div>
                <div *ngIf="name.errors.minlength">
                    Name must be atleast 5 characters.
                </div>
            </div>
        <br />
        <label>Address: </label>
        <input type="text" [formControl]="address">
        <br />
        <button type="submit" [disabled]='!loginform.valid'> Click </button>
    </form>
</div>
11:54
--------------------------------------------------------
import { Component, OnInit } from '@angular/core';
import {FormGroup, FormControl, Validators, MinLengthValidator} from '@angular/forms';
@Component({
  selector: 'app-reactiveforms',
  templateUrl: './reactiveforms.component.html',
  styleUrls: ['./reactiveforms.component.css']
})
export class ReactiveformsComponent implements OnInit {
  loginform:any = FormGroup;
  name:any = new FormControl;
  address:any = new FormControl;
  constructor() { }
  ngOnInit(): void {
      this.name =  new FormControl('', [Validators.required, Validators.minLength(5)]),
      this.address = new FormControl('',Validators.required)
      this.loginform = new FormGroup({
        name: this.name,
        address: this.address
      });
  }
  loginSubmit() {
    console.log(this.loginform.value);
  }
}

SR-Janakiram  12:21 PM
<nav>
    <a routerLink="/templateforms" routerLinkActive="active"> Template Forms </a>
    <br />
    <a routerLink="/reactiveforms" routerLinkActive="active"> Reactive Forms </a>
    <br />
    <a routerLink="/student" routerLinkActive="active"> Student </a>
    <br />
</nav>
<router-outlet></router-outlet>

--------------------------------------------------------------------
26April 
------
service
----
import { Injectable } from '@angular/core';
import {Subject, Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class MessageService {
  private subject = new Subject<any>();
  sendMessage(message: string) {
      this.subject.next({ text: message });
  }
  clearMessages() {
      this.subject.next({});
  }
  getMessage(): Observable<any> {
      return this.subject.asObservable();
  }
  constructor() { }
}
11:27
----------------------------------------------
app.component
--------------
import { Component, Input, OnInit } from '@angular/core';
import {MessageService} from './message.service';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'second';
  constructor(private msg:MessageService) {
  }
  sendMessage():void {
     this.msg.sendMessage('message passing');
  }
  clearMessage(): void {
    this.msg.clearMessages();
  }
  @Input() value: boolean = false;
  ngOnInit(): void {
  }
}