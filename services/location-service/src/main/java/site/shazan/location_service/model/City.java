package site.shazan.location_service.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String cityCode;
    @Column(nullable = false)
    private String countryCode;
    @Column(nullable = false)
    private String CountryName;
    @Column(nullable = false)
    private String regionCode;
    private String timeZoneId;
}
