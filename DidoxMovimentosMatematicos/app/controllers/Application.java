package controllers;

import org.joda.time.DateTime;

import com.avaje.ebean.common.BeanList;

import models.Task;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import views.html.novo;

public class Application extends Controller {
  
    public static Result index() {
    	BeanList<Task> tasks = (BeanList<Task>) Task.find.all();
        return ok(index.render(tasks));
    }
    
    public static Result novo(){
    	return ok(novo.render());
    }
    
    public static Result create(String nome){
    	if(nome != ""){
			new Task(nome, true, new DateTime()).save();
	    	return ok("Criado com sucesso");
    	}
    	return badRequest("Erro ao criar");
    }
  
}
