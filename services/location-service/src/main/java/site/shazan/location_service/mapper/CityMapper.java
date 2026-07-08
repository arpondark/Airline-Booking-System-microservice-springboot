package site.shazan.location_service.mapper;

import site.shazan.location_service.model.City;
import site.shazan.payload.request.CityRequest;

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
}
