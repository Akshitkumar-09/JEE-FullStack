package com.Collection;

public class DepartmentComparable implements Comparable<DepartmentComparable>{
	private int deptId;
	private String deptName;
	private String deptLeader;
	private int deptStrength;
	
	public DepartmentComparable(int deptId,String deptName,String deptLeader,int deptStrength) {
		super();
		this.deptId=deptId;
		this.deptName=deptName;
		this.deptLeader=deptLeader;
		this.deptStrength=deptStrength;
	}
	@Override
	public String toString() {
		return "DepartmentDetails [deptId=" + deptId + ", deptName=" + deptName + ", deptLeader=" + deptLeader + ", deptStrength=" + deptStrength + "]" ;
	}
	

	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptLeader() {
		return deptLeader;
	}
	public void setDeptLeader(String deptLeader) {
		this.deptLeader = deptLeader;
	}
	public int getDeptStrength() {
		return deptStrength;
	}
	public void setDeptStrength(int deptStrength) {
		this.deptStrength = deptStrength;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compareTo(DepartmentComparable d) {
	
		// TODO Auto-generated method stub
		return (deptName.compareTo(d.deptName));
		
			
	}

}


//return 0;

//else if(deptId > o.deptId)

//return 1;

//else return -1;

////TODO Auto-generated method stub