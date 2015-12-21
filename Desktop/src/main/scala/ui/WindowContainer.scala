package ui

import scalafx.scene.layout.BorderPane

/**
 * Created by Mnenmenth Alkaborin
 * Please refer to LICENSE file if included
 * for licensing information
 * https://github.com/Mnenmenth
 */
class WindowContainer extends BorderPane{


  var contentPane: ContentPane = _

  def setContentPane(cpane: ContentPane): Unit = {
    contentPane = cpane
    center = cpane
  }

}
