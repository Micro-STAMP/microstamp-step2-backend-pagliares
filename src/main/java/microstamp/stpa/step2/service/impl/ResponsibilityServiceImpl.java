package microstamp.stpa.step2.service.impl;

import lombok.AllArgsConstructor;

import microstamp.stpa.step2.dto.APIResponseDto;
import microstamp.stpa.step2.dto.ResponsibilityDto;
import microstamp.stpa.step2.entity.Responsibility;
import microstamp.stpa.step2.repository.ResponsibilityRepository;
import microstamp.stpa.step2.service.OpenFeignAPIClient;
import microstamp.stpa.step2.service.ResponsibilityService;
import org.springframework.stereotype.Service;
import microstamp.stpa.step2.dto.SystemSafetyConstraintDto;

@Service
@AllArgsConstructor
public class ResponsibilityServiceImpl implements ResponsibilityService {

    private ResponsibilityRepository responsibilityRepository;
    private OpenFeignAPIClient openFeignAPIClient;

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
    public APIResponseDto getResponsibilityById(Long responsibilityId) {
        Responsibility responsibility = responsibilityRepository.findById(responsibilityId).get();

        SystemSafetyConstraintDto systemSafetyConstraintDto = openFeignAPIClient.getSystemSafetyConstraint(responsibility.getSystemSafetyConstraintCode());

        ResponsibilityDto responsibilityDto = new ResponsibilityDto(
                responsibility.getId(),
                responsibility.getResponsibilityCode(),
                responsibility.getResponsibilityDescription(),
                responsibility.getSystemSafetyConstraintCode()
        );

        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setSystemSafetyConstraintDto(systemSafetyConstraintDto);
        apiResponseDto.setResponsibilityDto(responsibilityDto);

        return apiResponseDto;

    }
}
