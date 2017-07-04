package payday.employee.schedule;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import payday.employee.PaymentSchedule;

import javax.persistence.*;

/**
 * @author myeongju.jung
 */
@Entity
@Inheritance
@DiscriminatorColumn
@Getter
@ToString
@EqualsAndHashCode
public class AbstractPaymentSchedule implements PaymentSchedule {
    @Id
    @GeneratedValue
    private Integer scheduleId;
}