import { Component, OnInit } from '@angular/core';

import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-campusplacement',
  templateUrl: './campusplacement.component.html',
  styleUrls: ['./campusplacement.component.css']
})
export class CampusplacementComponent implements OnInit {

  constructor(public http:HttpClient) { }

  bloodgrp=["--select--","A+","A-","B-","B+","O+","O-","AB+","AB-"];
  country=["--select--","India","Australia","England","China","Pakisthan","Srilankha","South-America","France"];
  state=["--select--","AndhraPradesh","Karnataka","TamilNadu","Kerala","Delhi","UttarPradesh","MadhyaPradesh","Assam"];
  district=["--select--","Anantapur","Bangalore","Mumbai","Delhi","Jalandhar","Chandighar","Kochi","Amiritsar"];
  city=["-select-","north","west","south","east","northeast","southwest","northwest","all"];


var_userid=""
var_name=""
var_bgroup=""
var_number=""
var_country=""
var_state=""
var_district=""
var_city=""
var_email=""
var_password=""


register_clickHandler(){
  var applicant ={
        "userid": this.var_userid,
        "fullname": this.var_name,
        "bloodgroup": this.var_bgroup,
        "mobilenumber": this.var_number,
        "country": this.var_country,
        "state": this.var_state,
        "district": this.var_district,
        "city": this.var_city,
        "emailid": this.var_email,
        "password": this.var_password
  }

 this.http.post<any>("http://localhost:8080/donars",applicant).subscribe(data=>{
   alert('Registered Successfully!!!!')
 });

}

  ngOnInit(): void {
  }

}
