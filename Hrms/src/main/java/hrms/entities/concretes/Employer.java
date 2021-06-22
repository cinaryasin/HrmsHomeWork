package hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import hrms.core.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name="id",referencedColumnName = "id")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employers")
public class Employer extends User{

	

	@Column(name = "company_name")
	private String companyName;

	@Column(name = "web_address")
	private String webAddress;

	@Column(name = "phone_number")
	private String phoneNumber;

	@Column(name = "create_date")
	@JsonIgnore
	private LocalDate createDate;

	@Column(name = "search_status")
	private Boolean searchStatus;

	@JsonIgnore
    @Column(name="is_email_verified",columnDefinition = "boolean default false")
	private Boolean isEmailVerified;
    

	@JsonIgnore
    @Column(name="is_verified_by_emlopyee",columnDefinition = "boolean default false")
	private Boolean isVerifiedByEmlopyee;
	
	@Column(name = "is_active",columnDefinition = "boolean default false")
	@JsonIgnore
	private Boolean isActive;
	
}