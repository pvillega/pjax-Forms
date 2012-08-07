import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "forms"
    val appVersion      = "1.0"

    val appDependencies = Seq(
      // Add your project dependencies here,
      "EPFL" %% "play-js-validation" % "0.2-SNAPSHOT"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here      
      resolvers += Resolver.url("ivy-local", url("file://" + Path.userHome + "/.ivy2/local"))(Resolver.ivyStylePatterns),
      scalacOptions ++= Seq("-deprecation", "-unchecked", "-Xexperimental", "-Yvirtualize")
    )

}
