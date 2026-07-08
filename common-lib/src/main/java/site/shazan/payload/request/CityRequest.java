package site.shazan.payload.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CityRequest {
    @NotBlank( message = "Name cannot be blank")
    @Size(min = 2, max = 255, message = "Name must be between 2 and 255 characters")
    private String name;
    @NotBlank( message = "City Code cannot be blank")
    private String cityCode;
    @NotBlank( message = "Country Code cannot be blank")
    private String countryCode;
    @NotBlank( message = "Country cannot be blank")
    private String CountryName;

    private String regionCode;

    private String timeZoneId;
}