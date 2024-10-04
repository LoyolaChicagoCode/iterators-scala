name := "iterators-scala"

version := "0.4"

scalaVersion := "3.4.2"

scalacOptions += "@.scalacOptions.txt"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % Test

logBuffered := false

Test / parallelExecution := false

coverageExcludedPackages := """.*\.simple\..*;.*\.common.*;.*\.Main;benchmark\..*"""

enablePlugins(JavaAppPackaging)
enablePlugins(JmhPlugin)
