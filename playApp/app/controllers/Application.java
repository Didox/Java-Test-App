package controllers;

import play.*;
import play.mvc.*;

import views.html.*;
import models.*;

public class Application extends Controller {
  
    public static Result index() {
    	Post post = new Post();
    	post.post = "teste post";

        return ok("rota index, tambem tenho a rota /about :" + post.post);
    }

    public static Result about() {
        return ok("about test");
    }
  
}
