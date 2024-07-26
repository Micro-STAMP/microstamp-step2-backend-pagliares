package microstamp.stpa.step2.service;

import microstamp.stpa.step2.dto.SystemSafetyConstraintDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(url="http://localhost:8080", value="microstamp-step1-backend-pagliares")
@FeignClient(name="STEP1-MICROSERVICE-PAGLIARES")

public interface OpenFeignAPIClient {
    // Get SystemSafetyConstraint REST API
    @GetMapping("api/system-safety-constraints/{system-safety-constraint-code}")
    SystemSafetyConstraintDto getSystemSafetyConstraint(
            @PathVariable("system-safety-constraint-code") String systemSafetyConstraintCode);
}
