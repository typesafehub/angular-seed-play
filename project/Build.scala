import sbt._
import play.Project._

object ApplicationBuild extends Build {

  val appName = "angular-seed-play"
  val appVersion = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    "org.webjars" % "angularjs" % "1.0.5",
    "org.webjars" % "requirejs" % "2.1.1",
    "org.webjars" % "webjars-play" % "2.1.0-1",

    javaCore)

  val main = play.Project(appName, appVersion, appDependencies)
}
