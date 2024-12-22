package io.mohit;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
	public class Pokemon {
	    
	    @Id
	    @Column
	    private String name;
	    @Column
	    private String type;
	    @Column
	    private int power;
	    
	    // Getters and setters
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public String getType() {
	        return type;
	    }
	    public void setType(String type) {
	        this.type = type;
	    }
	    public int getPower() {
	        return power;
	    }
	    public void setPower(int power) {
	        this.power = power;
	    }

	   
	  
	   
	}

