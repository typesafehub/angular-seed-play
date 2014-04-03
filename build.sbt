name := "angular-seed-play"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.2.1-2",
  "org.webjars" % "angularjs" % "1.2.13"
)     

play.Project.playScalaSettings

requireJs += "app.js"

requireJsShim += "app-prod.js"

