name := "WordCount"

version := "1.0"

organization := "Scala in Action"

scalaVersion := "2.11.8"

resolvers ++= Seq(
  "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
)

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "3.8.4" % "test",
  "com.typesafe.akka" %% "akka-actor" % "2.4.8"
)
