name := "iterators-scala"

version := "0.4"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % Test

logBuffered := false

Test / parallelExecution := false

coverageExcludedPackages := """.*\.simple\..*;.*\.common.*;.*\.Main;benchmark\..*"""

enablePlugins(JavaAppPackaging)
enablePlugins(JmhPlugin)
