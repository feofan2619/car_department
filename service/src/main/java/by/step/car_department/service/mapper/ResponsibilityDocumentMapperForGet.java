package by.step.car_department.service.mapper;

import by.step.car_department.dao.model.ResponsibilityDocumentEntity;
import by.step.car_department.dao.model.dto.ResponsibilityDocumentDtoForGet;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ResponsibilityDocumentMapper {

    ResponsibilityDocumentEntity dtoToEntity(ResponsibilityDocumentDtoForGet responsibilityDocumentDtoForGet);
    ResponsibilityDocumentDtoForGet entityToDto(ResponsibilityDocumentEntity responsibilityDocumentEntity);
}