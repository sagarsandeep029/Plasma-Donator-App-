import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CampusreportComponent } from './campusreport.component';

describe('CampusreportComponent', () => {
  let component: CampusreportComponent;
  let fixture: ComponentFixture<CampusreportComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CampusreportComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CampusreportComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
