package site.shazan.location_service.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import site.shazan.payload.request.CityRequest;
import site.shazan.payload.response.CityResponse;


public interface CityService {
    CityResponse createCity(CityRequest request);
    CityResponse getCityById(Long id);
    CityResponse updateCity(Long id, CityRequest request);
    void deleteCity(Long id);
    Page<CityResponse> getAllCities(Pageable pageable);
    Page<CityResponse> searchCities(String keyword, Pageable pageable);

    Page<CityResponse> getCitiesByCountryCode(String countryCode, Pageable pageable);

    boolean isCityExists(String cityCode);
    boolean validateCityCode(String cityCode);
}
