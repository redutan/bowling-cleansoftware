package payday.employee.classification;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author myeongju.jung
 */
@Entity
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TimeCard {
    @Id
    private Long timeMillis;
    private double hours;

    public boolean equalsTimeMillis(Long timeMillis) {
        return this.timeMillis != null && this.timeMillis.equals(timeMillis);
    }

    public Date getDate() {
        return new Date(timeMillis);
    }
}
