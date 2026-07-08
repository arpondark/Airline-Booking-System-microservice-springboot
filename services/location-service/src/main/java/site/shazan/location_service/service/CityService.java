package site.shazan.location_service.service;

import site.shazan.payload.request.CityRequest;
import site.shazan.payload.response.CityResponse;

public interface CityService {
    CityResponse createCity(CityRequest request);
}
