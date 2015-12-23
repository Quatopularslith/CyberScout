package core

import java.nio.file.{Paths, Files}

/**
 * Created by Mnenmenth Alkaborin
 * Please refer to LICENSE file if included
 * for licensing information
 * https://github.com/Mnenmenth
 */
object Main {

  def main(args: Array[String]) {
    //Extract.extract("/h2-1.4.190.jar")
    import org.h2.tools.Server
    if(!Files.isDirectory(Paths.get("./db"))) Files.createDirectory(Paths.get("./db"))
    val web = Server.createWebServer("-webPort", "2222", "-baseDir", "./db", "-properties", "./db")
    web.start()
    println(web.getURL)

    val tcp = Server.createTcpServer("-tcpPort", "4444", "-baseDir", "./db", "-properties", "./db")
    tcp.start()
    println(tcp.getURL)
  }

}
