import { TestBed } from '@angular/core/testing';

import { MusixService } from './musix.service';

describe('MusixService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: MusixService = TestBed.get(MusixService);
    expect(service).toBeTruthy();
  });
});
