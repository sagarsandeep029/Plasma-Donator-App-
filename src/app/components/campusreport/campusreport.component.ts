import { Component, OnInit } from '@angular/core';
import{HttpClient} from '@angular/common/http';
@Component({
  selector: 'app-campusreport',
  templateUrl: './campusreport.component.html',
  styleUrls: ['./campusreport.component.css']
})
export class CampusreportComponent implements OnInit {

  constructor(public http:HttpClient) { }

  msg="";
  generateReport(){
    
    this.http.get("http://localhost:8080/donars").subscribe(data=>{
      
      for(var index in data){
        this.msg+="<b>UserId:</b> "+data[index].userid+" <b>Name:</b>  "+data[index].fullname+" <b>BloodGroup:</b> " +data[index].bloodgroup +
        "<b>Mobile:</b> "+data[index].mobilenumber+"<b>Country:</b> "+data[index].country+"<b>State:</b> "+data[index].state+"<b>District:</b> "+data[index].district+"<b>City:</b> "+data[index].city+
        "<b>EmaiID:</b> "+data[index].emailid+"<br/>";
      }

    })

  }

  ngOnInit(): void {
  }

}
