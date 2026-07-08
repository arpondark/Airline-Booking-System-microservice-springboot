package site.shazan.payload.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CityRequest {
    private String name;
    private String cityCode;
    private String countryCode;
    private String CountryName;
    private String regionCode;
    private String timeZoneId;
}