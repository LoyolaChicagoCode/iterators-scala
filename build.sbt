name := "iterators-scala"

version := "0.3"

scalaVersion := "3.0.2"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked", "-Yexplicit-nulls", "-language:strictEquality")

libraryDependencies ++= Seq(
  "org.scalatest"     %% "scalatest"  % "3.2.9"  % Test
)

logBuffered := false

Test / parallelExecution := false

enablePlugins(JavaAppPackaging)
enablePlugins(JmhPlugin)

scalacOptions ++= Seq("-rewrite", "-new-syntax")
