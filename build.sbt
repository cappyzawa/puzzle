import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.4",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "puzzle",
    fork in Test := true,
    libraryDependencies ++= Seq(
      scalaTest % Test,
      "org.specs2" %% "specs2-core" % "3.9.1" % "test"
      )

  )
