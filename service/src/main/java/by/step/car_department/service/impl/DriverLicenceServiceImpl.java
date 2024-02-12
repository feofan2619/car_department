package by.step.car_department.service.impl;

import by.step.car_department.dao.repository.DriverCertificateRepository;
import by.step.car_department.service.AbstractDriverCertificateService;
import by.step.car_department.service.dto.DriverCertificateDto;
import by.step.car_department.service.mapper.DriverCertificateMapper;

import java.util.List;

public class DriverCertificateServiceImpl implements AbstractDriverCertificateService {

    DriverCertificateRepository driverCertificateRepository;

    DriverCertificateMapper driverCertificateMapper;

    @Override
    public List<DriverCertificateDto> findAll(DriverCertificateDto driverCertificateDto) {
        return null;
    }

    @Override
    public DriverCertificateDto findById(Long id) {
        return null;
    }
}
