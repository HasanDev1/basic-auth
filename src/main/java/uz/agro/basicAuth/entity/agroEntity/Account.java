package uz.agro.basicAuth.entity.agroEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Account {
    @Id
    private String ID;
    private String BRANCH;
    private String ACC_BAL;
    private String CURRENCY;
    private String CLIENT;
    private String ID_ORDER;
    private String NAME;
    private String SGN;
    private String BAL;
    private Long SIGN_REGISTR;
    private Long S_IN;
    private Long S_OUT;
    private Long DT;
    private Long CT;
    private Long S_IN_TMP;
    private Long S_OUT_TMP;
    private Long DT_TMP;
    private Long CT_TMP;
    private LocalDate L_DATE;
    private LocalDate DATE_OPEN;
    private LocalDate DATE_CLOSE;
    private Integer ACC_GROUP_ID;
    private Integer STATE;
    private Integer KOD_ERR;
    private String FILE_NAME;
    private String REASON_CLOSE;
    private LocalDate DATE_OPEN_NIBBD;
    private LocalDate DATE_CLOSE_NIBBD;
    private String SUBBRANCH;

}
