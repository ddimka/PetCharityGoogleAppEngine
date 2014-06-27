package com.work.petcharity;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Blob;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Pet {

        @PrimaryKey
        @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
        Long id;
        @Persistent
        String PetName;
        @Persistent
        String Kalbiya;
        @Persistent
        String DeathDate;
        @Persistent
        String Description;
        @Persistent
        String MoneyNeeded;
        @Persistent
        String MoneyHave;
        @Persistent
        Blob Picture;
        
		public String getPetName() {
			return PetName;
		}
		public void setPetName(String petName) {
			PetName = petName;
		}
		public String getKalbiya() {
			return Kalbiya;
		}
		public void setKalbiya(String kalbiya) {
			Kalbiya = kalbiya;
		}
		public String getDeathDate() {
			return DeathDate;
		}
		public void setDeathDate(String deathDate) {
			DeathDate = deathDate;
		}
		public String getDescription() {
			return Description;
		}
		public void setDescription(String description) {
			Description = description;
		}
		public String getMoneyNeeded() {
			return MoneyNeeded;
		}
		public void setMoneyNeeded(String moneyNeeded) {
			MoneyNeeded = moneyNeeded;
		}
		public String getMoneyHave() {
			return MoneyHave;
		}
		public void setMoneyHave(String moneyHave) {
			MoneyHave = moneyHave;
		}
		public Long getId() {
			return id;
		}
		public Blob getPicture() {
			return Picture;
		}
		public void setPicture(Blob picture) {
			Picture = picture;
		}
 
 
        
}


