package site.shazan.location_service.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import site.shazan.location_service.service.CityService;
import site.shazan.payload.request.CityRequest;
import site.shazan.payload.response.CityResponse;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {
    @Override
    public CityResponse createCity(CityRequest request) {
        return null;
    }

    @Override
    public CityResponse getCityById(Long id) {
        return null;
    }

    @Override
    public CityResponse updateCity(Long id, CityRequest request) {
        return null;
    }

    @Override
    public void deleteCity(Long id) {

    }

    @Override
    public Page<CityResponse> getAllCities(Pageable pageable) {
        return null;
    }

    @Override
    public Page<CityResponse> searchCities(String keyword, Pageable pageable) {
        return null;
    }

    @Override
    public Page<CityResponse> getCitiesByCountryCode(String countryCode, Pageable pageable) {
        return null;
    }

    @Override
    public boolean isCityExists(String cityCode) {
        return false;
    }

    @Override
    public boolean validateCityCode(String cityCode) {
        return false;
    }
}
