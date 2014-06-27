package com.work.petcharity;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Kalbiya {

        @PrimaryKey
        @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
        Long id;
        @Persistent
        String name;
        @Persistent
        String phone;
        @Persistent
        String responsiblePerson;
        @Persistent
        String responsiblePersonTel;
        @Persistent
        String PayPalAccount;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getResponsiblePerson() {
			return responsiblePerson;
		}
		public void setResponsiblePerson(String responsiblePerson) {
			this.responsiblePerson = responsiblePerson;
		}
		public String getResponsiblePersonTel() {
			return responsiblePersonTel;
		}
		public void setResponsiblePersonTel(String responsiblePersonTel) {
			this.responsiblePersonTel = responsiblePersonTel;
		}
		public String getPayPalAccount() {
			return PayPalAccount;
		}
		public void setPayPalAccount(String payPalAccount) {
			PayPalAccount = payPalAccount;
		}
        
		

}


