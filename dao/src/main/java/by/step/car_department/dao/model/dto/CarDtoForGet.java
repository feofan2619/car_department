package by.step.car_department.dao.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class CarDto {

    private Long id;
    private Double price;
    private Integer odometer;
    private Double fuelConsumption;
    private String boardNumber;
    private CarCertificateDtoForGet carCertificate;
    private Instant created;
    private Instant updated;
}
