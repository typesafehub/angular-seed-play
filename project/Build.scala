import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName = "angular-seed-play"
  val appVersion = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    "org.webjars" % "webjars-play" % "2.1.0",
    "org.webjars" % "angularjs" % "1.0.3",
    javaCore)

  val main = play.Project(appName, appVersion, appDependencies).settings()

}
