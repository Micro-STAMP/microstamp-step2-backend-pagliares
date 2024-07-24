package microstamp.stpa.step2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ResponsibilityDto {
    private Long id;
    private String responsibilityCode;
    private String responsibilityDescription;
    private String systemSafetyConstraintCode;
}
