package microstamp.stpa.step2.service;

import microstamp.stpa.step2.dto.APIResponseDto;
import microstamp.stpa.step2.dto.ResponsibilityDto;

public interface ResponsibilityService {
    ResponsibilityDto saveResponsibility(ResponsibilityDto responsibilityDto);

    APIResponseDto getResponsibilityById(Long id);

}
