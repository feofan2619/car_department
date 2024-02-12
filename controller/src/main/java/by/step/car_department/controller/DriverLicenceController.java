package by.step.car_department.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/certificates_drivers")
@Tag(name = "certificates drivers app", description = "controller for work with certificates drivers")
public class DriverCertificateController {
}
