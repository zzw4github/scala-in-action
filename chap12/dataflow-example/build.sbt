name := "DataflowExample"

organization := "scalainaction"

version := "0.3"

scalaVersion := "2.11.8"

scalacOptions ++= Seq("-unchecked", "-deprecation")

autoCompilerPlugins := true

libraryDependencies <+= scalaVersion { v => compilerPlugin("org.scala-lang.plugins" %% "scala-continuations-library" % "1.0.2") }

scalacOptions += "-P:continuations:enable"

resolvers += ("Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/")

libraryDependencies ++= Seq(
	"com.typesafe.akka" %% "akka-dataflow" % "2.3.15",
  "org.specs2" %% "specs2-core" % "3.8.4" % "test"
)

