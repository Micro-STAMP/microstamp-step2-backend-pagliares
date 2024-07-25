package microstamp.stpa.step2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class APIResponseDto {
    private SystemSafetyConstraintDto systemSafetyConstraintDto;
    private ResponsibilityDto responsibilityDto;

}
