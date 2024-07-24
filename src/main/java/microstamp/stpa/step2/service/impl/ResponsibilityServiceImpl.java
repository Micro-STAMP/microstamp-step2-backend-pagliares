package microstamp.stpa.step2.service.impl;

import lombok.AllArgsConstructor;

import microstamp.stpa.step2.dto.ResponsibilityDto;
import microstamp.stpa.step2.entity.Responsibility;
import microstamp.stpa.step2.repository.ResponsibilityRepository;
import microstamp.stpa.step2.service.ResponsibilityService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ResponsibilityServiceImpl implements ResponsibilityService {

    private ResponsibilityRepository responsibilityRepository;

    @Override
    public ResponsibilityDto saveResponsibility(ResponsibilityDto responsibilityDto) {
        Responsibility responsibility = new Responsibility(
                responsibilityDto.getId(),
                responsibilityDto.getResponsibilityCode(),
                responsibilityDto.getResponsibilityDescription(),
                responsibilityDto.getSystemSafetyConstraintCode()
        );

        Responsibility savedResponsibility = responsibilityRepository.save(responsibility);

        ResponsibilityDto savedResponsibilityDto = new ResponsibilityDto(
                savedResponsibility.getId(),
                savedResponsibility.getResponsibilityCode(),
                savedResponsibility.getResponsibilityDescription(),
                savedResponsibility.getSystemSafetyConstraintCode()
        );

        return savedResponsibilityDto;

    }

    @Override
    public ResponsibilityDto getResponsibilityById(Long responsibilityId) {
        Responsibility responsibility = responsibilityRepository.findById(responsibilityId).get();

        ResponsibilityDto responsibilityDto = new ResponsibilityDto(
                responsibility.getId(),
                responsibility.getResponsibilityCode(),
                responsibility.getResponsibilityDescription(),
                responsibility.getSystemSafetyConstraintCode()
        );

        return responsibilityDto;

    }
}
