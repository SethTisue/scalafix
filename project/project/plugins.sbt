addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.19")
unmanagedSources.in(Compile) += baseDirectory.value / ".." / "Dependencies.scala"
