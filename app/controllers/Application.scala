package controllers

import play.api.mvc.{Action, Controller}
import play.api.http.MimeTypes

object Application extends Controller {

  def dynamicIndex = Action {
    Ok(views.html.DynamicIndex())
  }
  
  // returns the JavaScript used to setup RequireJS for WebJars
  def setupRequireJs = Action {
    Ok(org.webjars.RequireJS.getSetupJavaScript(routes.WebJarAssets.at("").url)).as(MimeTypes.JAVASCRIPT)
  }
  
}
