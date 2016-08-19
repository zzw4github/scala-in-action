name := "SupervisorExample"

organization := "scalainaction"

version := "0.3"

scalaVersion := "2.11.8"

scalacOptions ++= Seq("-unchecked", "-deprecation")

resolvers += ("Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/")

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.4.8"
)

