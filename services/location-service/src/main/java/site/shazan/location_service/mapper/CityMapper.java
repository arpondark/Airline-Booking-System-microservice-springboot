package site.shazan.location_service.mapper;

import site.shazan.location_service.model.City;
import site.shazan.payload.request.CityRequest;
import site.shazan.payload.response.CityResponse;

public class CityMapper {
    public static City getCity(CityRequest request) {
        if(request == null) return null;
        return City.builder()
                .name(request.getName())
                .countryCode(request.getCountryCode())
                .cityCode(request.getCityCode())
                .regionCode(request.getRegionCode())
                .countryName(request.getCountryName())
                .timeZoneId(request.getTimeZoneId())
                .build();
    }

    public static CityResponse toResponse(City city) {
        if(city == null ) return null;
        return CityResponse.builder()
                .id(city.getId())
                .name(city.getName())
                .cityCode(city.getCityCode())
                .countryCode(city.getCountryCode())
                .countryName(city.getCountryName())
                .regionCode(city.getRegionCode())
                .timeZoneId(city.getTimeZoneId())
                .build();
    }

    public static City updateEntity(City city, CityRequest request) {
        if (request.getName() != null) {
            city.setName(request.getName().trim());
        }

        if (request.getCityCode() != null) {
            city.setCityCode(request.getCityCode().toUpperCase().trim());
        }

        if (request.getCountryCode() != null) {
            city.setCountryCode(request.getCountryCode().toUpperCase().trim());
        }

        if (request.getCountryName() != null) {
            city.setCountryName(request.getCountryName().trim());
        }

        if (request.getRegionCode() != null) {
            city.setRegionCode(request.getRegionCode().toUpperCase().trim());
        }

        return city;
    }
}
