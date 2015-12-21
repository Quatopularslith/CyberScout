package core

import scalikejdbc.{ConnectionPool, LoggingSQLAndTimeSettings, GlobalSettings}
import ui.MainWindow

import scalafx.application.JFXApp

/**
 * Created by Mnenmenth Alkaborin
 * Please refer to LICENSE file if included
 * for licensing information
 * https://github.com/Mnenmenth
 */
object CyberScout extends JFXApp{

  Class.forName("org.sqlite.JDBC")
  GlobalSettings.loggingSQLAndTime = new LoggingSQLAndTimeSettings(enabled = true, singleLineMode = true, logLevel = 'DEBUG)
  ConnectionPool.singleton("jdbc:sqlite:hotforge.db", null, null)

  stage = new MainWindow
  stage.setMaximized(true)

}
