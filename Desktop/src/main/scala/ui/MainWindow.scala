package ui

import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene

/**
 * Created by Mnenmenth Alkaborin
 * Please refer to LICENSE file if included
 * for licensing information
 * https://github.com/Mnenmenth
 */
class MainWindow extends PrimaryStage{

  val mainScene = new Scene
  mainScene.root = new WindowContainer
  scene = mainScene

  width = 1280
  height = 720

  resizable = true

  title = "Cyber Scout"

}
