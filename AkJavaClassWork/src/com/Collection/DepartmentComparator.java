package com.Collection;

public class DepartmentComparator {
	private int deptId;
	private String deptName;
	private String deptLeader;
	private int deptStrength;
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
	public DepartmentComparator(int deptId, String deptName, String deptLeader, int deptStrength) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptLeader = deptLeader;
		this.deptStrength = deptStrength;
	}
	public String getDeptLeader() {
		return deptLeader;
	}
	@Override
	public String toString() {
		return "DepartmentComparator [deptId=" + deptId + ", deptName=" + deptName + ", deptLeader=" + deptLeader
				+ ", deptStrength=" + deptStrength + "]";
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

}
