name := "angularjs_sample"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "org.webjars" %% "webjars-play" % "2.2.1",
  "org.webjars" % "angularjs" % "1.2.7",
  "org.webjars" % "requirejs" % "2.1.8"
)     

playAssetsDirectories <+= baseDirectory / "client/app"

play.Project.playScalaSettings
