// @GENERATOR:play-routes-compiler
// @SOURCE:H:/play-java-starter-example/play-java-starter-example/conf/routes
// @DATE:Sun Jul 22 14:01:15 IST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
