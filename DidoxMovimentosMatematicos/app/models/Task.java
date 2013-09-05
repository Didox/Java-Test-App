package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.joda.time.DateTime;

import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;

@Entity 
public class Task extends Model {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Task(String name, Boolean done, DateTime dueDate) {
		this.name = name; this.done = done; this.dueDate = dueDate;
	}
	
  @Id
  @Constraints.Min(10)
  public Long id;
  
  @Constraints.Required
  public String name;
  
  public boolean done;
  
  @Formats.DateTime(pattern="dd/MM/yyyy")
  public DateTime dueDate = new DateTime();
  
  public static Finder<Long,Task> find = new Finder<Long,Task>(
    Long.class, Task.class
  ); 

}