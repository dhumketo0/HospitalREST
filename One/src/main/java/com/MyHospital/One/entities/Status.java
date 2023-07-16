package com.MyHospital.One.entities;

public enum Status {
    ADMITTED{
    	@Override
    	public String toString() {
    		// TODO Auto-generated method stub
    		return "ADMITTED";
    	}
    },
    DISCHARGED{
    	@Override
    	public String toString() {
    		// TODO Auto-generated method stub
    		return "DISCHARGED";
    	}
    }
}
