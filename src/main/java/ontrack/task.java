package ontrack;

import java.time.LocalDate;

public class task {

	private String Id;
	private LocalDate DD;
	private String status;

	public task(String Id, LocalDate DD, String status) {

		this.Id = Id;
		this.DD = DD;
		this.status = status;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public LocalDate getDD() {
		return DD;
	}

	public void setDD(LocalDate dD) {
		DD = dD;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}