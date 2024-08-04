package in.ineuron.entities;

public class Employe {
	
	private Integer eId;
	private String eName;
	public Employe(Integer eId, String eName) {
		super();
		this.eId = eId;
		this.eName = eName;
	}
	public Integer geteId() {
		return eId;
	}
	public void seteId(Integer eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	
	
}
