package by.step.car_department.service;

import by.step.car_department.service.dto.DriverCertificateDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AbstractDriverCertificateService {

    List<DriverCertificateDto> findAll(DriverCertificateDto driverCertificateDto);

    DriverCertificateDto findById(Long id);
}
