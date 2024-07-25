package microstamp.stpa.step2.controller;

import lombok.AllArgsConstructor;
import microstamp.stpa.step2.dto.APIResponseDto;
import microstamp.stpa.step2.dto.ResponsibilityDto;
import microstamp.stpa.step2.service.ResponsibilityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/responsibilities")
@AllArgsConstructor
public class ResponsibilityController {
    private ResponsibilityService responsibilityService;

    // Build Save Responsibility REST API
    @PostMapping
    public ResponseEntity<ResponsibilityDto> saveResponsibility(@RequestBody ResponsibilityDto responsibilityDto){
        ResponsibilityDto savedResponsibilityDto = responsibilityService.saveResponsibility(responsibilityDto);
        return new ResponseEntity<ResponsibilityDto>(savedResponsibilityDto, HttpStatus.CREATED);
    }

    // Build Get Responsibility REST API
    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getResponsibility(@PathVariable("id") Long responsibilityId){
        APIResponseDto apiResponseDto = responsibilityService.getResponsibilityById(responsibilityId);
        return new ResponseEntity<>(apiResponseDto, HttpStatus.OK);
    }
}
