package controllers

import play.api.http.ContentTypes
import play.api.mvc._

object Application extends Controller {

  def success = Action {
    val uuid = java.util.UUID.randomUUID.toString
    Ok(
      s"""<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
          |<result>
          |  <success>true</success>
          |  <message>success</message>
          |  <accountId>$uuid</accountId>
          |</result>
                """.stripMargin
    ).as(ContentTypes.XML)
  }

}