package uz.agro.basicAuth.entity.agroEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "client_p")
public class Client_p {
    @Id
    private String id;
    private String branch;
    private String name;
    private LocalDate birthday;
    private String post_address;
    private String passport_type;
    private String passport_serial;
    private String passport_number;
    private String passport_place_registration;
    private LocalDate passport_date_registration;
    private String code_place_regist;
    private LocalDate date_registration;
    private String number_registration_doc;
    private String code_tax_org;
    private String number_tax_registration;
    private String code_sector;
    private String code_organ_direct;
    private String code_bank;
    private String account;
    private String code_class_credit;
    private Integer state;
    private Integer kod_err;
    private String file_name;
    private String code_citizenship;
    private String birth_place;
    private String code_capacity;
    private LocalDate capacity_status_date;
    private String capacity_status_place;
    private String num_certif_capacity;
    private String phone_home;
    private String email_address;
    private String pension_sertif_serial;
    private String code_gender;
    private String code_nation;
    private String code_birth_region;
    private String code_birth_distr;
    private String type_document;
    private LocalDate passport_date_expiration;
    private String code_adr_region;
    private String code_adr_distr;
    private String inps;
    private String family;
    private String first_name;
    private String patronymic;
    private String sign_vip;
    private String crm_id;
    private String crm_is_master;
    private String pinfl;
    private LocalDate date_open_nibbd;
    private LocalDate date_close_nibbd;
    private String id_nibbd;
    private String close_type;
    private String close_doc_n;
    private LocalDate close_doc_d;
    private String drive_permit_ser;
    private String drive_permit_num;
    private LocalDate drive_permit_reg_d;
    private LocalDate drive_permit_exp_d;
    private String drive_permit_place;
    private Integer agreement;
    private String zip_code;
    private String contract_num;
}
