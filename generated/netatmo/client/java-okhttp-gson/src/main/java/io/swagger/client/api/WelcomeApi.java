package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import com.google.gson.reflect.TypeToken;

import com.squareup.okhttp.Call;

import java.lang.reflect.Type;

import java.util.*;

import io.swagger.client.model.NADeviceListResponse;
import io.swagger.client.model.NAMeasureResponse;
import io.swagger.client.model.NAUserResponse;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class WelcomeApi {
  private ApiClient apiClient;

  public WelcomeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WelcomeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /* Build call for devicelist */
  private Call devicelistCall(String accessToken, String appType, String deviceId, Boolean getFavorites) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
       throw new ApiException("Missing the required parameter 'accessToken' when calling devicelist(Async)");
    }
    

    // create path and map variables
    String path = "/api/devicelist".replaceAll("\\{format\\}","json");

    List<Pair> queryParams = new ArrayList<Pair>();
    if (accessToken != null)
      queryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    if (appType != null)
      queryParams.addAll(apiClient.parameterToPairs("", "app_type", appType));
    if (deviceId != null)
      queryParams.addAll(apiClient.parameterToPairs("", "device_id", deviceId));
    if (getFavorites != null)
      queryParams.addAll(apiClient.parameterToPairs("", "get_favorites", getFavorites));

    Map<String, String> headerParams = new HashMap<String, String>();

    Map<String, Object> formParams = new HashMap<String, Object>();

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);
    if (accept != null) headerParams.put("Accept", accept);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    headerParams.put("Content-Type", contentType);

    String[] authNames = new String[] {  };
    return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, authNames);
  }

  /**
   * 
   * The method devicelist returns the list of devices owned by the user, and their modules.\nA device is identified by its _id (which is its mac address) and each device may have one, several or no modules, also identified by an _id.
   * @param accessToken Your access token
   * @param appType Defines which device type will be returned by devicelist. It could be app_thermostat or app_station (by default if not provided)
   * @param deviceId Specify a device_id if you want to retrieve only this device informations.
   * @param getFavorites When set to \&quot;true\&quot;, the favorite devices of the user are returned. This flag is available only if the devices requested are Weather Stations.
   * @return NADeviceListResponse
   */
  public NADeviceListResponse devicelist(String accessToken, String appType, String deviceId, Boolean getFavorites) throws ApiException {
    Call call = devicelistCall(accessToken, appType, deviceId, getFavorites);
    Type returnType = new TypeToken<NADeviceListResponse>(){}.getType();
    return apiClient.execute(call, returnType);
  }

  /**
   *  (asynchronously)
   * The method devicelist returns the list of devices owned by the user, and their modules.\nA device is identified by its _id (which is its mac address) and each device may have one, several or no modules, also identified by an _id.
   * @param accessToken Your access token
   * @param appType Defines which device type will be returned by devicelist. It could be app_thermostat or app_station (by default if not provided)
   * @param deviceId Specify a device_id if you want to retrieve only this device informations.
   * @param getFavorites When set to \&quot;true\&quot;, the favorite devices of the user are returned. This flag is available only if the devices requested are Weather Stations.
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   */
  public Call devicelistAsync(String accessToken, String appType, String deviceId, Boolean getFavorites, ApiCallback<NADeviceListResponse> callback) throws ApiException {
    Call call = devicelistCall(accessToken, appType, deviceId, getFavorites);
    Type returnType = new TypeToken<NADeviceListResponse>(){}.getType();
    apiClient.executeAsync(call, returnType, callback);
    return call;
  }
  
  /* Build call for getmeasure */
  private Call getmeasureCall(String accessToken, String deviceId, String scale, List<String> type, String moduleId, Integer dateBegin, Integer dateEnd, Integer limit, Boolean optimize, Boolean realTime) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
       throw new ApiException("Missing the required parameter 'accessToken' when calling getmeasure(Async)");
    }
    
    // verify the required parameter 'deviceId' is set
    if (deviceId == null) {
       throw new ApiException("Missing the required parameter 'deviceId' when calling getmeasure(Async)");
    }
    
    // verify the required parameter 'scale' is set
    if (scale == null) {
       throw new ApiException("Missing the required parameter 'scale' when calling getmeasure(Async)");
    }
    
    // verify the required parameter 'type' is set
    if (type == null) {
       throw new ApiException("Missing the required parameter 'type' when calling getmeasure(Async)");
    }
    

    // create path and map variables
    String path = "/api/getmeasure".replaceAll("\\{format\\}","json");

    List<Pair> queryParams = new ArrayList<Pair>();
    if (accessToken != null)
      queryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    if (deviceId != null)
      queryParams.addAll(apiClient.parameterToPairs("", "device_id", deviceId));
    if (moduleId != null)
      queryParams.addAll(apiClient.parameterToPairs("", "module_id", moduleId));
    if (scale != null)
      queryParams.addAll(apiClient.parameterToPairs("", "scale", scale));
    if (type != null)
      queryParams.addAll(apiClient.parameterToPairs("csv", "type", type));
    if (dateBegin != null)
      queryParams.addAll(apiClient.parameterToPairs("", "date_begin", dateBegin));
    if (dateEnd != null)
      queryParams.addAll(apiClient.parameterToPairs("", "date_end", dateEnd));
    if (limit != null)
      queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    if (optimize != null)
      queryParams.addAll(apiClient.parameterToPairs("", "optimize", optimize));
    if (realTime != null)
      queryParams.addAll(apiClient.parameterToPairs("", "real_time", realTime));

    Map<String, String> headerParams = new HashMap<String, String>();

    Map<String, Object> formParams = new HashMap<String, Object>();

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);
    if (accept != null) headerParams.put("Accept", accept);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    headerParams.put("Content-Type", contentType);

    String[] authNames = new String[] {  };
    return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, authNames);
  }

  /**
   * 
   * The method getmeasure returns the measurements of a device or a module.
   * @param accessToken Your access token
   * @param deviceId Id of the device whose module&#39;s measurements you want to retrieve. This _id can be found in the user&#39;s devices field.
   * @param scale Defines the time interval between two measurements.\nPossible values :\nmax -&gt; every value stored will be returned\n30min -&gt; 1 value every 30 minutes\n1hour -&gt; 1 value every hour\n3hours -&gt; 1 value every 3 hours\n1day -&gt; 1 value per day\n1week -&gt; 1 value per week\n1month -&gt; 1 value per month
   * @param type Sets the type of measurement you want to retrieve.\nThe different types of measurements must be given in a comma separated list of strings.\nExample: type=\&quot;Temperature,Humidity\&quot;\nDepending on the device&#39;s type and the scale, different measurements are available:\nFor Weather Station :\n\n  max -&gt; Temperature, CO2, Humidity, Pressure, Noise, Rain (if\nmodule_id is a rain sensor)\n\n  30min, 1hour, 3hours -&gt; Temperature, CO2, Humidity, Pressure,\nNoise, min_temp, max_temp, min_hum, max_hum, min_pressure, max_pressure, min_noise, max_noise, sum_rain (if module_id is a rain sensor)\n\n  1day, 1week, 1month -&gt; Temperature, Co2, Humidity, Pressure, Noise,\nmin_temp, date_min_temp, max_temp, date_max_temp, min_hum, date_min_hum, max_hum, date_max_hum, min_pressure, date_min_pressure, max_pressure, date_max_pressure, min_noise, date_min_noise, max_noise, date_max_noise, date_min_co2, date_max_co2, sum_rain (if module_id is a rain sensor)\nPlease note, the measurements sent in the response will be in the same order as in this list.\nAll measurements are expressed in metric units:\n\n  Temperature: Celsius\n\n  Humidity: %\n\n  Co2: ppm\n\n  Pressure: mbar\n\n  Noise: db\n\n  Rain: mm\n\nFor Thermostat:\n\n  max -&gt; Temperature, Sp_Temperature, BoilerOn, BoilerOff\n\n  30min, 1hour, 3hours -&gt; Temperature, Sp_Temperature, min_temp,\nmax_temp, sum_boiler_on, sum_boiler_off\n\n  1day, 1week, 1month -&gt; Temperature, min_temp, date_min_temp,\nmax_temp, sum_boiler_on, sum_boiler_off\n\n  where\n\nTemperature: Celsius\n\n  Sp_Temperature (temperature setpoint): Celsius\n\n  BoilerOn: Duration, since the previous data point, during which the\nboiler has been on (in seconds)\n\n  BoilerOff : Duration, since the previous data point, during which\nthe boiler has been off (in seconds).\n\n  sum_boiler_on: Total duration during which the boiler has been on,\nat a specific scale (in seconds).\n\n  sum_boiler_off: Total duration during which the boiler has been\noff, at a specific scale (in seconds).
   * @param moduleId If you don&#39;t specify any module_id you will retrieve the device&#39;s measurements. If you specify a module_id you will retrieve the module&#39;s measurements.
   * @param dateBegin Starting timestamp (utc) of the requested measurements.\nPlease note measurement retrieving is limited to 1024 measurements.
   * @param dateEnd Ending timestamp (utc) of the request measurements.\nIf you want only the last measurement, do not provide date_begin, and set date_end to \&quot;last\&quot;.
   * @param limit Limits the number of measurements returned (default &amp; max is 1024)
   * @param optimize Allows you to choose the format of the answer.\nIf you build a mobile app and bandwith usage is an issue, use optimize = true.\nUse optimize = false, for an easier parse. In this case, values are indexed by sorted timestamp.\nExample of un-optimized response :\n{\&quot;status\&quot;: \&quot;ok\&quot;, \n  \&quot;body\&quot;: {\n    \&quot;1347575400\&quot;: [18.3,39],\n    \&quot;1347586200\&quot;: [20.6,48]\n  },\n\&quot;time_exec\&quot;: 0.012136936187744}\nIf optimize is set true, measurements are returned as an array of series of regularly spaced measurements. Each series is defined by a beginning time beg_time and a step between measurements, step_time:\n{\&quot;status\&quot;: \&quot;ok\&quot;,\n  \&quot;body\&quot;: [\n    {\&quot;beg_time\&quot;: 1347575400,\n     \&quot;step_time\&quot;: 10800,\n     \&quot;value\&quot;: \n        [[18.3,39],\n        [ 20.6,48]]\n    }],\n\&quot;time_exec\&quot;: 0.014238119125366}\nDefault value is true.
   * @param realTime In scales higher than max, since the data is aggregated, the timestamps returned are by default offset by +(scale/2).\nFor instance, if you ask for measurements at a daily scale, you will receive data timestamped at 12:00 if real_time is set to false (default case), and timestamped at 00:00 if real_time is set to true.\nNB : The servers always store data with real_time set to true and data are offset by this parameter AFTER having being time-filtered, thus you could have data after date_end if real_time is set to false.
   * @return NAMeasureResponse
   */
  public NAMeasureResponse getmeasure(String accessToken, String deviceId, String scale, List<String> type, String moduleId, Integer dateBegin, Integer dateEnd, Integer limit, Boolean optimize, Boolean realTime) throws ApiException {
    Call call = getmeasureCall(accessToken, deviceId, scale, type, moduleId, dateBegin, dateEnd, limit, optimize, realTime);
    Type returnType = new TypeToken<NAMeasureResponse>(){}.getType();
    return apiClient.execute(call, returnType);
  }

  /**
   *  (asynchronously)
   * The method getmeasure returns the measurements of a device or a module.
   * @param accessToken Your access token
   * @param deviceId Id of the device whose module&#39;s measurements you want to retrieve. This _id can be found in the user&#39;s devices field.
   * @param scale Defines the time interval between two measurements.\nPossible values :\nmax -&gt; every value stored will be returned\n30min -&gt; 1 value every 30 minutes\n1hour -&gt; 1 value every hour\n3hours -&gt; 1 value every 3 hours\n1day -&gt; 1 value per day\n1week -&gt; 1 value per week\n1month -&gt; 1 value per month
   * @param type Sets the type of measurement you want to retrieve.\nThe different types of measurements must be given in a comma separated list of strings.\nExample: type=\&quot;Temperature,Humidity\&quot;\nDepending on the device&#39;s type and the scale, different measurements are available:\nFor Weather Station :\n\n  max -&gt; Temperature, CO2, Humidity, Pressure, Noise, Rain (if\nmodule_id is a rain sensor)\n\n  30min, 1hour, 3hours -&gt; Temperature, CO2, Humidity, Pressure,\nNoise, min_temp, max_temp, min_hum, max_hum, min_pressure, max_pressure, min_noise, max_noise, sum_rain (if module_id is a rain sensor)\n\n  1day, 1week, 1month -&gt; Temperature, Co2, Humidity, Pressure, Noise,\nmin_temp, date_min_temp, max_temp, date_max_temp, min_hum, date_min_hum, max_hum, date_max_hum, min_pressure, date_min_pressure, max_pressure, date_max_pressure, min_noise, date_min_noise, max_noise, date_max_noise, date_min_co2, date_max_co2, sum_rain (if module_id is a rain sensor)\nPlease note, the measurements sent in the response will be in the same order as in this list.\nAll measurements are expressed in metric units:\n\n  Temperature: Celsius\n\n  Humidity: %\n\n  Co2: ppm\n\n  Pressure: mbar\n\n  Noise: db\n\n  Rain: mm\n\nFor Thermostat:\n\n  max -&gt; Temperature, Sp_Temperature, BoilerOn, BoilerOff\n\n  30min, 1hour, 3hours -&gt; Temperature, Sp_Temperature, min_temp,\nmax_temp, sum_boiler_on, sum_boiler_off\n\n  1day, 1week, 1month -&gt; Temperature, min_temp, date_min_temp,\nmax_temp, sum_boiler_on, sum_boiler_off\n\n  where\n\nTemperature: Celsius\n\n  Sp_Temperature (temperature setpoint): Celsius\n\n  BoilerOn: Duration, since the previous data point, during which the\nboiler has been on (in seconds)\n\n  BoilerOff : Duration, since the previous data point, during which\nthe boiler has been off (in seconds).\n\n  sum_boiler_on: Total duration during which the boiler has been on,\nat a specific scale (in seconds).\n\n  sum_boiler_off: Total duration during which the boiler has been\noff, at a specific scale (in seconds).
   * @param moduleId If you don&#39;t specify any module_id you will retrieve the device&#39;s measurements. If you specify a module_id you will retrieve the module&#39;s measurements.
   * @param dateBegin Starting timestamp (utc) of the requested measurements.\nPlease note measurement retrieving is limited to 1024 measurements.
   * @param dateEnd Ending timestamp (utc) of the request measurements.\nIf you want only the last measurement, do not provide date_begin, and set date_end to \&quot;last\&quot;.
   * @param limit Limits the number of measurements returned (default &amp; max is 1024)
   * @param optimize Allows you to choose the format of the answer.\nIf you build a mobile app and bandwith usage is an issue, use optimize = true.\nUse optimize = false, for an easier parse. In this case, values are indexed by sorted timestamp.\nExample of un-optimized response :\n{\&quot;status\&quot;: \&quot;ok\&quot;, \n  \&quot;body\&quot;: {\n    \&quot;1347575400\&quot;: [18.3,39],\n    \&quot;1347586200\&quot;: [20.6,48]\n  },\n\&quot;time_exec\&quot;: 0.012136936187744}\nIf optimize is set true, measurements are returned as an array of series of regularly spaced measurements. Each series is defined by a beginning time beg_time and a step between measurements, step_time:\n{\&quot;status\&quot;: \&quot;ok\&quot;,\n  \&quot;body\&quot;: [\n    {\&quot;beg_time\&quot;: 1347575400,\n     \&quot;step_time\&quot;: 10800,\n     \&quot;value\&quot;: \n        [[18.3,39],\n        [ 20.6,48]]\n    }],\n\&quot;time_exec\&quot;: 0.014238119125366}\nDefault value is true.
   * @param realTime In scales higher than max, since the data is aggregated, the timestamps returned are by default offset by +(scale/2).\nFor instance, if you ask for measurements at a daily scale, you will receive data timestamped at 12:00 if real_time is set to false (default case), and timestamped at 00:00 if real_time is set to true.\nNB : The servers always store data with real_time set to true and data are offset by this parameter AFTER having being time-filtered, thus you could have data after date_end if real_time is set to false.
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   */
  public Call getmeasureAsync(String accessToken, String deviceId, String scale, List<String> type, String moduleId, Integer dateBegin, Integer dateEnd, Integer limit, Boolean optimize, Boolean realTime, ApiCallback<NAMeasureResponse> callback) throws ApiException {
    Call call = getmeasureCall(accessToken, deviceId, scale, type, moduleId, dateBegin, dateEnd, limit, optimize, realTime);
    Type returnType = new TypeToken<NAMeasureResponse>(){}.getType();
    apiClient.executeAsync(call, returnType, callback);
    return call;
  }
  
  /* Build call for getuser */
  private Call getuserCall(String accessToken) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
       throw new ApiException("Missing the required parameter 'accessToken' when calling getuser(Async)");
    }
    

    // create path and map variables
    String path = "/api/getuser".replaceAll("\\{format\\}","json");

    List<Pair> queryParams = new ArrayList<Pair>();
    if (accessToken != null)
      queryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));

    Map<String, String> headerParams = new HashMap<String, String>();

    Map<String, Object> formParams = new HashMap<String, Object>();

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);
    if (accept != null) headerParams.put("Accept", accept);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);
    headerParams.put("Content-Type", contentType);

    String[] authNames = new String[] {  };
    return apiClient.buildCall(path, "GET", queryParams, postBody, headerParams, formParams, authNames);
  }

  /**
   * 
   * The method getuser returns information about a user such as prefered language, prefered units, and list of devices.
   * @param accessToken Your access token
   * @return NAUserResponse
   */
  public NAUserResponse getuser(String accessToken) throws ApiException {
    Call call = getuserCall(accessToken);
    Type returnType = new TypeToken<NAUserResponse>(){}.getType();
    return apiClient.execute(call, returnType);
  }

  /**
   *  (asynchronously)
   * The method getuser returns information about a user such as prefered language, prefered units, and list of devices.
   * @param accessToken Your access token
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   */
  public Call getuserAsync(String accessToken, ApiCallback<NAUserResponse> callback) throws ApiException {
    Call call = getuserCall(accessToken);
    Type returnType = new TypeToken<NAUserResponse>(){}.getType();
    apiClient.executeAsync(call, returnType, callback);
    return call;
  }
  
}
