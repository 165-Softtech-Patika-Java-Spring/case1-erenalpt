package housing;

import java.math.BigDecimal;
import java.util.ArrayList;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Housing {

    private int id;
    private String houseType;
    private BigDecimal price;
    private int squareMeter;
    private int roomCount;
    private int saloonCount;

}
