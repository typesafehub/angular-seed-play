package controllers;

import play.api.mvc.Action;
import play.api.mvc.AnyContent;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render());
    }

    public static Action<AnyContent> webJarAssetsAtLocation(final String file) {
        return controllers.WebJarAssets.at(controllers.WebJarAssets
                .locate(file));
    }
}
