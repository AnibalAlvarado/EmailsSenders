import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormTypeEmailComponent } from './form-type-email.component';

describe('FormTypeEmailComponent', () => {
  let component: FormTypeEmailComponent;
  let fixture: ComponentFixture<FormTypeEmailComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FormTypeEmailComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FormTypeEmailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
