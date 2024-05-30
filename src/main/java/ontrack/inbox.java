package ontrack;

import java.util.ArrayList;

public class inbox {
	private String Unit; 
	private ArrayList<task> Tasks; 
	
	public inbox() {
		Unit = "SIT707";
		Tasks = new ArrayList<task>();
	}
	
	public inbox(String unit, ArrayList<task> tasks) {
		Unit = unit;
		Tasks = tasks;
	}

	public String getUnit() {
		return Unit;
	}

	public void setUnit(String unit) {
		Unit = unit;
	}

	public ArrayList<task> getTasks() {
		return Tasks;
	}

	public void setTasks(ArrayList<task> tasks) {
		Tasks = tasks;
	}

	public void Add(task tsk) 
	{ 
		this.Tasks.add(tsk);
	}
	public void Remove(task tsk) { 
		this.Tasks.remove(tsk); 
	}
}
