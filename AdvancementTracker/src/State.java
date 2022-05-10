import java.util.ArrayList;

public class State {
	
	private String name;
	private boolean state;
	private ArrayList<String> sub = new ArrayList<String>();
	
	public State() {
		this.name = "none";
		this.state = false;
		
	}
	
	public State(String name, boolean state) {
		this.name = name;
		this.state = state;
	}
	
	public ArrayList<String> getSub() {
		return sub;
	}

	public void addSub(String x) {
		sub.add(x);
	}
	
	public void setState(Boolean state) {
		this.state = state;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public Boolean getState() {
		return state;
	}
}
