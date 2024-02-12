package by.step.car_department.service.mapper;

import by.step.car_department.dao.model.DriverEntity;
import by.step.car_department.dao.model.dto.DriverDtoForGet;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface DriverMapper {

    DriverEntity dtoToEntity(DriverDtoForGet driverDtoForGet);

    DriverDtoForGet entityToDto(DriverEntity driver);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "id", source = "id", ignore = true)
    @Mapping(target = "driverLicence", source = "driverLicence", ignore = true)
    DriverEntity updateDriverFromDriverDto(DriverDtoForGet driverDtoForGet, @MappingTarget DriverEntity driver);
}
