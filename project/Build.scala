import sbt._
import Keys._
import play.Project._
import java.io.File

object ApplicationBuild extends Build {

  val appName = "angular-seed-play"
  val appVersion = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    "org.webjars" % "angularjs" % "1.0.5",
    "org.webjars" % "requirejs" % "2.1.1",
    "org.webjars" % "webjars-play" % "2.1.1-SNAPSHOT",

    javaCore)

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // For additionally resolving from the conventional ivy local home.
    resolvers += Resolver.file("LocalIvy", file(Path.userHome +
      File.separator + ".ivy2" + File.separator +
      "local"))(Resolver.ivyStylePatterns))
}
