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
	public void Show() 
	{ 
		if(this.Tasks.isEmpty()) { 
			System.out.println("None"); 
		} else { 
			for(int i=0; i< this.Tasks.size(); i++) 
			{ 
				System.out.println(i+ ": " + Tasks.get(i).getId()+" - "+Tasks.get(i).getStatus()+" - "+Tasks.get(i).getDD()); 
			} 
		} 
	} 
}
