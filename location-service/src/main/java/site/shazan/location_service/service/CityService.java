package site.shazan.location_service.service;

import site.shazan.location_service.response.CityResponse;

public interface CityService {
    CityResponse createCity(CityRequest request);
}
