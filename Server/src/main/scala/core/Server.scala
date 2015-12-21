package core

import java.net.{Socket, ServerSocket}

/**
 * Created by Mnenmenth Alkaborin
 * Please refer to LICENSE file if included
 * for licensing information
 * https://github.com/Mnenmenth
 */
object Server {

  val port = 25565
  lazy val sSocket: ServerSocket = new ServerSocket(port)
  var socket: Socket = _
  def main(args: Array[String]) {
    while(true){
      println("Waiting for incoming connections")
      socket = sSocket.accept()
      println("Client connected")

    }
  }

}
