package microstamp.stpa.step2.service;

import microstamp.stpa.step2.dto.ResponsibilityDto;

public interface ResponsibilityService {
    ResponsibilityDto saveResponsibility(ResponsibilityDto responsibilityDto);

    ResponsibilityDto getResponsibilityById(Long id);

}
