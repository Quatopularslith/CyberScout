(ns database.DBInit
  :import [java.sql]
  (:gen-class
  :name database.DBInit
  :methods [
             #^:static [connection [] void]
             ]))