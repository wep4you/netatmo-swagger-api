package io.swagger.client.api

import io.swagger.client.model.NANewScheduleResponse
import io.swagger.client.model.NAThermProgram
import io.swagger.client.model.NADeviceListResponse
import io.swagger.client.model.NAMeasureResponse
import io.swagger.client.model.NAThermStateResponse
import io.swagger.client.model.NAUserResponse
import io.swagger.client.model.NAOkResponse
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class ThermostatApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def createnewschedule(accessToken: String,
      deviceId: String,
      moduleId: String,
      thermProgram: NAThermProgram)(implicit reader: ClientResponseReader[NANewScheduleResponse], writer: RequestWriter[NAThermProgram]): Future[NANewScheduleResponse] = {
    // create path and map variables
    val path = (addFmt("/api/createnewschedule"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(accessToken != null)   queryParams += "access_token" -> accessToken.toString
    if(deviceId != null)   queryParams += "device_id" -> deviceId.toString
    if(moduleId != null)   queryParams += "module_id" -> moduleId.toString

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(thermProgram))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def devicelist(accessToken: String,
      appType: Option[String] = None,
      deviceId: Option[String] = None,
      getFavorites: Option[Boolean] = None
      )(implicit reader: ClientResponseReader[NADeviceListResponse]): Future[NADeviceListResponse] = {
    // create path and map variables
    val path = (addFmt("/api/devicelist"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(accessToken != null)   queryParams += "access_token" -> accessToken.toStringif(appType != null) appType.foreach { v => queryParams += "app_type" -> v.toString }if(deviceId != null) deviceId.foreach { v => queryParams += "device_id" -> v.toString }if(getFavorites != null) getFavorites.foreach { v => queryParams += "get_favorites" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def getmeasure(accessToken: String,
      deviceId: String,
      scale: String,
      _type: List[String],
      moduleId: Option[String] = None,
      dateBegin: Option[Integer] = None,
      dateEnd: Option[Integer] = None,
      limit: Option[Integer] = None,
      optimize: Option[Boolean] = None,
      realTime: Option[Boolean] = None
      )(implicit reader: ClientResponseReader[NAMeasureResponse]): Future[NAMeasureResponse] = {
    // create path and map variables
    val path = (addFmt("/api/getmeasure"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(accessToken != null)   queryParams += "access_token" -> accessToken.toString
    if(deviceId != null)   queryParams += "device_id" -> deviceId.toStringif(moduleId != null) moduleId.foreach { v => queryParams += "module_id" -> v.toString }
    if(scale != null)   queryParams += "scale" -> scale.toString
    if(_type != null)   queryParams += "type" -> _type.toStringif(dateBegin != null) dateBegin.foreach { v => queryParams += "date_begin" -> v.toString }if(dateEnd != null) dateEnd.foreach { v => queryParams += "date_end" -> v.toString }if(limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }if(optimize != null) optimize.foreach { v => queryParams += "optimize" -> v.toString }if(realTime != null) realTime.foreach { v => queryParams += "real_time" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def getthermstate(accessToken: String,
      deviceId: String,
      moduleId: String)(implicit reader: ClientResponseReader[NAThermStateResponse]): Future[NAThermStateResponse] = {
    // create path and map variables
    val path = (addFmt("/api/getthermstate"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(accessToken != null)   queryParams += "access_token" -> accessToken.toString
    if(deviceId != null)   queryParams += "device_id" -> deviceId.toString
    if(moduleId != null)   queryParams += "module_id" -> moduleId.toString

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def getuser(accessToken: String)(implicit reader: ClientResponseReader[NAUserResponse]): Future[NAUserResponse] = {
    // create path and map variables
    val path = (addFmt("/api/getuser"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(accessToken != null)   queryParams += "access_token" -> accessToken.toString

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def setthermpoint(accessToken: String,
      deviceId: String,
      moduleId: String,
      setpointMode: String,
      setpointEndtime: Option[Integer] = None,
      setpointTemp: Option[Float] = None
      )(implicit reader: ClientResponseReader[NAOkResponse]): Future[NAOkResponse] = {
    // create path and map variables
    val path = (addFmt("/api/setthermpoint"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(accessToken != null)   queryParams += "access_token" -> accessToken.toString
    if(deviceId != null)   queryParams += "device_id" -> deviceId.toString
    if(moduleId != null)   queryParams += "module_id" -> moduleId.toString
    if(setpointMode != null)   queryParams += "setpoint_mode" -> setpointMode.toStringif(setpointEndtime != null) setpointEndtime.foreach { v => queryParams += "setpoint_endtime" -> v.toString }if(setpointTemp != null) setpointTemp.foreach { v => queryParams += "setpoint_temp" -> v.toString }

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def switchschedule(accessToken: String,
      deviceId: String,
      moduleId: String,
      scheduleId: String)(implicit reader: ClientResponseReader[NAOkResponse]): Future[NAOkResponse] = {
    // create path and map variables
    val path = (addFmt("/api/switchschedule"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(accessToken != null)   queryParams += "access_token" -> accessToken.toString
    if(deviceId != null)   queryParams += "device_id" -> deviceId.toString
    if(moduleId != null)   queryParams += "module_id" -> moduleId.toString
    if(scheduleId != null)   queryParams += "schedule_id" -> scheduleId.toString

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def syncschedule(accessToken: String,
      deviceId: String,
      moduleId: String,
      thermProgram: NAThermProgram)(implicit reader: ClientResponseReader[NAOkResponse], writer: RequestWriter[NAThermProgram]): Future[NAOkResponse] = {
    // create path and map variables
    val path = (addFmt("/api/syncschedule"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(accessToken != null)   queryParams += "access_token" -> accessToken.toString
    if(deviceId != null)   queryParams += "device_id" -> deviceId.toString
    if(moduleId != null)   queryParams += "module_id" -> moduleId.toString

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(thermProgram))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}
