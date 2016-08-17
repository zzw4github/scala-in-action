name := "Nano Http server"

version := "1.0"

organization := "Scala in Action"

scalaVersion := "2.11.8"

// append options passed to the Scala compiler
scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")


libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "1.13" % "test"
)
