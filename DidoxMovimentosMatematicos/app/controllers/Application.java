package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
    public Result index() {
    	return ok(index.render());
    }
    
    public Result getJson(){
    	BeanList<Task> tasks = (BeanList<Task>) Task.find.all();
    	return ok(Json.toJson(tasks));
    }
}
