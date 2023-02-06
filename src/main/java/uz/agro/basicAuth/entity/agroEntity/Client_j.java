package uz.agro.basicAuth.entity.agroEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Client_j {
    @Id
    private String ID;
    private String BRANCH;
    private String NAME;
    private String SHORT_NAME;
    private LocalDate DATE_REGISTRATION;
    private String NUMBER_REGISTRATION_DOC;
    private String CODE_TAX_ORG;
    private String NUMBER_TAX_REGISTRATION;
    private String CODE_SECTOR;
    private String CODE_ORGAN_DIRECT;
    private String CODE_HEAD_ORGANIZATION;
    private String CODE_CLASS_CREDIT;
    private String DIRECTOR_NAME;
    private String DIRECTOR_PASSPORT;
    private String CHIEF_ACCOUNTER_NAME;
    private String CHIEF_ACCOUNTER_PASSPORT;
    private String CODE_BANK;
    private String ACCOUNT;
    private String POST_ADDRESS;
    private String PHONE;
    private String FAX;
    private String EMAIL;
    private String SIGN_TRADE;
    private Long STATE;
    private Long KOD_ERR;
    private String FILE_NAME;
    private String PLACE_REGIST_NAME;
    private String OPF;
    private String SOATO;
    private String OKPO;
    private String INN_HEAD_ORGANIZATION;
    private String REGION;
    private String DISTR;
    private String SMALL_BUSINESS;
    private LocalDate PATENT_EXPIRATION;
    private String DIRECTOR_TYPE_DOCUMENT;
    private String DIRECTOR_PASSP_SERIAL;
    private String DIRECTOR_PASSP_NUMBER;
    private LocalDate DIRECTOR_PASSP_DATE_REG;
    private String DIRECTOR_PASSP_PLACE_REG;
    private LocalDate DIRECTOR_PASSP_DATE_END;
    private String ACCOUNTANT_TYPE_DOCUMENT;
    private String ACCOUNTANT_PASSP_SERIAL;
    private String ACCOUNTANT_PASSP_NUMBER;
    private LocalDate ACCOUNTANT_PASSP_DATE_REG;
    private String ACCOUNTANT_PASSP_PLACE_REG;
    private LocalDate ACCOUNTANT_PASSP_DATE_END;
    private String RESPONSIBLE_EMP;
    private String DIRECTOR_CODE_CITIZENSHIP;
    private LocalDate DIRECTOR_BIRTHDAY;
    private String DIRECTOR_BIRTH_PLACE;
    private String DIRECTOR_ADDRESS;
    private String ACCOUNTANT_CODE_CITIZENSHIP;
    private LocalDate ACCOUNTANT_BIRTHDAY;
    private String ACCOUNTANT_BIRTH_PLACE;
    private String ACCOUNTANT_ADDRESS;
    private String SIGN_VIP;
    private String CODE_SECTOR_OLD;
    private int TYPE_NON_RESIDENT;
    private String SIGN_DEP_ACC;
    private String SWIFT_ID;
    private String TYPE_ACTIVITY;
    private String DIRECTOR_FAMILY;
    private String DIRECTOR_FIRST_NAME;
    private String DIRECTOR_PATRONYMIC;
    private String ACCOUNTANT_FAMILY;
    private String ACCOUNTANT_FIRST_NAME;
    private String ACCOUNTANT_PATRONYMIC;
    private String DIRECTOR_DRV_PERMIT_SER;
    private String DIRECTOR_DRV_PERMIT_NUM;
    private LocalDate DIRECTOR_DRV_PERMIT_REG_D;
    private LocalDate DIRECTOR_DRV_PERMIT_EXP_D;
    private String DIRECTOR_DRV_PERMIT_PLACE;
    private String ACCOUNTANT_DRV_PERMIT_SER;
    private String ACCOUNTANT_DRV_PERMIT_NUM;
    private LocalDate ACCOUNTANT_DRV_PERMIT_REG_D;
    private LocalDate ACCOUNTANT_DRV_PERMIT_EXP_D;
    private String ACCOUNTANT_DRV_PERMIT_PLACE;
    private String ZIP_CODE;
    private String CONTRACT_NUM;
    private String DIRECTOR_INN;
    private String DIRECTOR_PINFL;
    private String DIRECTOR_CODE_RESIDENT;
    private String DIRECTOR_CODE_GENDER;
    private String DIRECTOR_CODE_REGION;
    private String DIRECTOR_CODE_DISTR;
    private String DIRECTOR_PHONE;
    private String ACCOUNTANT_INN;
    private String ACCOUNTANT_PINFL;
    private String ACCOUNTANT_CODE_RESIDENT;
    private String ACCOUNTANT_CODE_GENDER;
    private String ACCOUNTANT_CODE_REGION;
    private String ACCOUNTANT_CODE_DISTR;
    private String ACCOUNTANT_PHONE;

}
