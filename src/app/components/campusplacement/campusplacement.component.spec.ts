import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CampusplacementComponent } from './campusplacement.component';

describe('CampusplacementComponent', () => {
  let component: CampusplacementComponent;
  let fixture: ComponentFixture<CampusplacementComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CampusplacementComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CampusplacementComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
