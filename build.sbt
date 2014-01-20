name := "angularjs_sample"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "org.webjars" %% "webjars-play" % "2.2.1",
  "org.webjars" % "angularjs" % "1.2.9",
  "org.webjars" % "requirejs" % "2.1.10"
)     

play.Project.playScalaSettings
