package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity  //hangi katmana bağlı olduğunu gösteriyoruz
@Table(name="job_titles") //veri tabanında hangi tabloya karşılık geldiği 
public class Job {
	@Id //tablodaki id alanını söylememiz gerekiyor. 
	@Column(name ="id")//Hangi kolona bağlı olduğu
	private int id;
	
	@Column(name ="title")
	private String jobName;

}
