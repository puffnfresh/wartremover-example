scalaVersion := "2.10.2"

resolvers += Resolver.sonatypeRepo("releases")

addCompilerPlugin("org.brianmckenna" % "wartremover" % "0.4" cross CrossVersion.full)

scalacOptions += "-P:wartremover:traverser:org.brianmckenna.wartremover.warts.Unsafe"
