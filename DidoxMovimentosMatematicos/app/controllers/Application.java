package controllers;

import org.joda.time.DateTime;

import models.Task;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller {
  
    public static Result index() {
    	new Task("Didox", true, new DateTime()).save();
        return ok(index.render("Movimentos Matematicos " + Task.find.all().get(0).name));
    }
  
}
