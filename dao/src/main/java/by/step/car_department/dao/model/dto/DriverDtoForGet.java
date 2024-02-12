package by.step.car_department.dao.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class DriverDto {

    private Long id;
    private String name;
    private String lastName;
    private String passportNumber;
    private DriverLicenceDto driverLicence;
    private Instant created;
    private Instant updated;
}
