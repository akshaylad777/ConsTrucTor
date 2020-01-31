package com.constrOverloading;

public class Constr_with_This {
	private int roll_no;
	
	public Constr_with_This() {

		roll_no=100;
	}
		
	public Constr_with_This(int rnum){
			this();
			roll_no=roll_no+rnum;	
		}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	
	
	}
	


