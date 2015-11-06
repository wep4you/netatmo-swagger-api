<?php
/**
 * NAHouseModel
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   http://github.com/swagger-api/swagger-codegen
 * @license  http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link     https://github.com/swagger-api/swagger-codegen
 */
/**
 *  Copyright 2015 SmartBear Software
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;

use \ArrayAccess;
/**
 * NAHouseModel Class Doc Comment
 *
 * @category    Class
 * @description 
 * @package     Swagger\Client
 * @author      http://github.com/swagger-api/swagger-codegen
 * @license     http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class NAHouseModel implements ArrayAccess
{
    /**
      * Array of property to type mappings. Used for (de)serialization 
      * @var string[]
      */
    static $swaggerTypes = array(
        'algo_type' => 'string',
        'ca' => '\Swagger\Client\Model\NAHouseModelCa',
        'ext_temps' => 'map[string,int]',
        'first_anticipate_avail' => 'bool',
        'first_pid_avail' => 'bool',
        'gefs' => '\Swagger\Client\Model\NAStation',
        'in_use' => 'string',
        'last_compute_try' => '\Swagger\Client\Model\NADate',
        'link_station' => '\Swagger\Client\Model\NALinkStation',
        'pid_algo' => '\Swagger\Client\Model\NAPidAlgo',
        'station' => '\Swagger\Client\Model\NAStation',
        'prefered_algo_type' => 'string',
        'simple_algo' => '\Swagger\Client\Model\NASimpleAlgo',
        'time' => '\Swagger\Client\Model\NADate',
        'station_firsttime_anticipate' => 'bool',
        'time_algo_changed' => 'int',
        'time_pid_computed' => 'int'
    );
  
    /** 
      * Array of attributes where the key is the local name, and the value is the original name
      * @var string[] 
      */
    static $attributeMap = array(
        'algo_type' => 'algo_type',
        'ca' => 'ca',
        'ext_temps' => 'ext_temps',
        'first_anticipate_avail' => 'first_anticipate_avail',
        'first_pid_avail' => 'first_pid_avail',
        'gefs' => 'gefs',
        'in_use' => 'in_use',
        'last_compute_try' => 'last_compute_try',
        'link_station' => 'link_station',
        'pid_algo' => 'pid_algo',
        'station' => 'station',
        'prefered_algo_type' => 'prefered_algo_type',
        'simple_algo' => 'simple_algo',
        'time' => 'time',
        'station_firsttime_anticipate' => 'station_firsttime_anticipate',
        'time_algo_changed' => 'time_algo_changed',
        'time_pid_computed' => 'time_pid_computed'
    );
  
    /**
      * Array of attributes to setter functions (for deserialization of responses)
      * @var string[]
      */
    static $setters = array(
        'algo_type' => 'setAlgoType',
        'ca' => 'setCa',
        'ext_temps' => 'setExtTemps',
        'first_anticipate_avail' => 'setFirstAnticipateAvail',
        'first_pid_avail' => 'setFirstPidAvail',
        'gefs' => 'setGefs',
        'in_use' => 'setInUse',
        'last_compute_try' => 'setLastComputeTry',
        'link_station' => 'setLinkStation',
        'pid_algo' => 'setPidAlgo',
        'station' => 'setStation',
        'prefered_algo_type' => 'setPreferedAlgoType',
        'simple_algo' => 'setSimpleAlgo',
        'time' => 'setTime',
        'station_firsttime_anticipate' => 'setStationFirsttimeAnticipate',
        'time_algo_changed' => 'setTimeAlgoChanged',
        'time_pid_computed' => 'setTimePidComputed'
    );
  
    /**
      * Array of attributes to getter functions (for serialization of requests)
      * @var string[]
      */
    static $getters = array(
        'algo_type' => 'getAlgoType',
        'ca' => 'getCa',
        'ext_temps' => 'getExtTemps',
        'first_anticipate_avail' => 'getFirstAnticipateAvail',
        'first_pid_avail' => 'getFirstPidAvail',
        'gefs' => 'getGefs',
        'in_use' => 'getInUse',
        'last_compute_try' => 'getLastComputeTry',
        'link_station' => 'getLinkStation',
        'pid_algo' => 'getPidAlgo',
        'station' => 'getStation',
        'prefered_algo_type' => 'getPreferedAlgoType',
        'simple_algo' => 'getSimpleAlgo',
        'time' => 'getTime',
        'station_firsttime_anticipate' => 'getStationFirsttimeAnticipate',
        'time_algo_changed' => 'getTimeAlgoChanged',
        'time_pid_computed' => 'getTimePidComputed'
    );
  
    
    /**
      * $algo_type 
      * @var string
      */
    protected $algo_type;
    
    /**
      * $ca 
      * @var \Swagger\Client\Model\NAHouseModelCa
      */
    protected $ca;
    
    /**
      * $ext_temps 
      * @var map[string,int]
      */
    protected $ext_temps;
    
    /**
      * $first_anticipate_avail 
      * @var bool
      */
    protected $first_anticipate_avail;
    
    /**
      * $first_pid_avail 
      * @var bool
      */
    protected $first_pid_avail;
    
    /**
      * $gefs 
      * @var \Swagger\Client\Model\NAStation
      */
    protected $gefs;
    
    /**
      * $in_use 
      * @var string
      */
    protected $in_use;
    
    /**
      * $last_compute_try 
      * @var \Swagger\Client\Model\NADate
      */
    protected $last_compute_try;
    
    /**
      * $link_station 
      * @var \Swagger\Client\Model\NALinkStation
      */
    protected $link_station;
    
    /**
      * $pid_algo 
      * @var \Swagger\Client\Model\NAPidAlgo
      */
    protected $pid_algo;
    
    /**
      * $station 
      * @var \Swagger\Client\Model\NAStation
      */
    protected $station;
    
    /**
      * $prefered_algo_type 
      * @var string
      */
    protected $prefered_algo_type;
    
    /**
      * $simple_algo 
      * @var \Swagger\Client\Model\NASimpleAlgo
      */
    protected $simple_algo;
    
    /**
      * $time 
      * @var \Swagger\Client\Model\NADate
      */
    protected $time;
    
    /**
      * $station_firsttime_anticipate 
      * @var bool
      */
    protected $station_firsttime_anticipate;
    
    /**
      * $time_algo_changed 
      * @var int
      */
    protected $time_algo_changed;
    
    /**
      * $time_pid_computed 
      * @var int
      */
    protected $time_pid_computed;
    

    /**
     * Constructor
     * @param mixed[] $data Associated array of property value initalizing the model
     */
    public function __construct(array $data = null)
    {
        if ($data != null) {
            $this->algo_type = $data["algo_type"];
            $this->ca = $data["ca"];
            $this->ext_temps = $data["ext_temps"];
            $this->first_anticipate_avail = $data["first_anticipate_avail"];
            $this->first_pid_avail = $data["first_pid_avail"];
            $this->gefs = $data["gefs"];
            $this->in_use = $data["in_use"];
            $this->last_compute_try = $data["last_compute_try"];
            $this->link_station = $data["link_station"];
            $this->pid_algo = $data["pid_algo"];
            $this->station = $data["station"];
            $this->prefered_algo_type = $data["prefered_algo_type"];
            $this->simple_algo = $data["simple_algo"];
            $this->time = $data["time"];
            $this->station_firsttime_anticipate = $data["station_firsttime_anticipate"];
            $this->time_algo_changed = $data["time_algo_changed"];
            $this->time_pid_computed = $data["time_pid_computed"];
        }
    }
    
    /**
     * Gets algo_type
     * @return string
     */
    public function getAlgoType()
    {
        return $this->algo_type;
    }
  
    /**
     * Sets algo_type
     * @param string $algo_type 
     * @return $this
     */
    public function setAlgoType($algo_type)
    {
        
        $this->algo_type = $algo_type;
        return $this;
    }
    
    /**
     * Gets ca
     * @return \Swagger\Client\Model\NAHouseModelCa
     */
    public function getCa()
    {
        return $this->ca;
    }
  
    /**
     * Sets ca
     * @param \Swagger\Client\Model\NAHouseModelCa $ca 
     * @return $this
     */
    public function setCa($ca)
    {
        
        $this->ca = $ca;
        return $this;
    }
    
    /**
     * Gets ext_temps
     * @return map[string,int]
     */
    public function getExtTemps()
    {
        return $this->ext_temps;
    }
  
    /**
     * Sets ext_temps
     * @param map[string,int] $ext_temps 
     * @return $this
     */
    public function setExtTemps($ext_temps)
    {
        
        $this->ext_temps = $ext_temps;
        return $this;
    }
    
    /**
     * Gets first_anticipate_avail
     * @return bool
     */
    public function getFirstAnticipateAvail()
    {
        return $this->first_anticipate_avail;
    }
  
    /**
     * Sets first_anticipate_avail
     * @param bool $first_anticipate_avail 
     * @return $this
     */
    public function setFirstAnticipateAvail($first_anticipate_avail)
    {
        
        $this->first_anticipate_avail = $first_anticipate_avail;
        return $this;
    }
    
    /**
     * Gets first_pid_avail
     * @return bool
     */
    public function getFirstPidAvail()
    {
        return $this->first_pid_avail;
    }
  
    /**
     * Sets first_pid_avail
     * @param bool $first_pid_avail 
     * @return $this
     */
    public function setFirstPidAvail($first_pid_avail)
    {
        
        $this->first_pid_avail = $first_pid_avail;
        return $this;
    }
    
    /**
     * Gets gefs
     * @return \Swagger\Client\Model\NAStation
     */
    public function getGefs()
    {
        return $this->gefs;
    }
  
    /**
     * Sets gefs
     * @param \Swagger\Client\Model\NAStation $gefs 
     * @return $this
     */
    public function setGefs($gefs)
    {
        
        $this->gefs = $gefs;
        return $this;
    }
    
    /**
     * Gets in_use
     * @return string
     */
    public function getInUse()
    {
        return $this->in_use;
    }
  
    /**
     * Sets in_use
     * @param string $in_use 
     * @return $this
     */
    public function setInUse($in_use)
    {
        
        $this->in_use = $in_use;
        return $this;
    }
    
    /**
     * Gets last_compute_try
     * @return \Swagger\Client\Model\NADate
     */
    public function getLastComputeTry()
    {
        return $this->last_compute_try;
    }
  
    /**
     * Sets last_compute_try
     * @param \Swagger\Client\Model\NADate $last_compute_try 
     * @return $this
     */
    public function setLastComputeTry($last_compute_try)
    {
        
        $this->last_compute_try = $last_compute_try;
        return $this;
    }
    
    /**
     * Gets link_station
     * @return \Swagger\Client\Model\NALinkStation
     */
    public function getLinkStation()
    {
        return $this->link_station;
    }
  
    /**
     * Sets link_station
     * @param \Swagger\Client\Model\NALinkStation $link_station 
     * @return $this
     */
    public function setLinkStation($link_station)
    {
        
        $this->link_station = $link_station;
        return $this;
    }
    
    /**
     * Gets pid_algo
     * @return \Swagger\Client\Model\NAPidAlgo
     */
    public function getPidAlgo()
    {
        return $this->pid_algo;
    }
  
    /**
     * Sets pid_algo
     * @param \Swagger\Client\Model\NAPidAlgo $pid_algo 
     * @return $this
     */
    public function setPidAlgo($pid_algo)
    {
        
        $this->pid_algo = $pid_algo;
        return $this;
    }
    
    /**
     * Gets station
     * @return \Swagger\Client\Model\NAStation
     */
    public function getStation()
    {
        return $this->station;
    }
  
    /**
     * Sets station
     * @param \Swagger\Client\Model\NAStation $station 
     * @return $this
     */
    public function setStation($station)
    {
        
        $this->station = $station;
        return $this;
    }
    
    /**
     * Gets prefered_algo_type
     * @return string
     */
    public function getPreferedAlgoType()
    {
        return $this->prefered_algo_type;
    }
  
    /**
     * Sets prefered_algo_type
     * @param string $prefered_algo_type 
     * @return $this
     */
    public function setPreferedAlgoType($prefered_algo_type)
    {
        
        $this->prefered_algo_type = $prefered_algo_type;
        return $this;
    }
    
    /**
     * Gets simple_algo
     * @return \Swagger\Client\Model\NASimpleAlgo
     */
    public function getSimpleAlgo()
    {
        return $this->simple_algo;
    }
  
    /**
     * Sets simple_algo
     * @param \Swagger\Client\Model\NASimpleAlgo $simple_algo 
     * @return $this
     */
    public function setSimpleAlgo($simple_algo)
    {
        
        $this->simple_algo = $simple_algo;
        return $this;
    }
    
    /**
     * Gets time
     * @return \Swagger\Client\Model\NADate
     */
    public function getTime()
    {
        return $this->time;
    }
  
    /**
     * Sets time
     * @param \Swagger\Client\Model\NADate $time 
     * @return $this
     */
    public function setTime($time)
    {
        
        $this->time = $time;
        return $this;
    }
    
    /**
     * Gets station_firsttime_anticipate
     * @return bool
     */
    public function getStationFirsttimeAnticipate()
    {
        return $this->station_firsttime_anticipate;
    }
  
    /**
     * Sets station_firsttime_anticipate
     * @param bool $station_firsttime_anticipate 
     * @return $this
     */
    public function setStationFirsttimeAnticipate($station_firsttime_anticipate)
    {
        
        $this->station_firsttime_anticipate = $station_firsttime_anticipate;
        return $this;
    }
    
    /**
     * Gets time_algo_changed
     * @return int
     */
    public function getTimeAlgoChanged()
    {
        return $this->time_algo_changed;
    }
  
    /**
     * Sets time_algo_changed
     * @param int $time_algo_changed 
     * @return $this
     */
    public function setTimeAlgoChanged($time_algo_changed)
    {
        
        $this->time_algo_changed = $time_algo_changed;
        return $this;
    }
    
    /**
     * Gets time_pid_computed
     * @return int
     */
    public function getTimePidComputed()
    {
        return $this->time_pid_computed;
    }
  
    /**
     * Sets time_pid_computed
     * @param int $time_pid_computed 
     * @return $this
     */
    public function setTimePidComputed($time_pid_computed)
    {
        
        $this->time_pid_computed = $time_pid_computed;
        return $this;
    }
    
    /**
     * Returns true if offset exists. False otherwise.
     * @param  integer $offset Offset 
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->$offset);
    }
  
    /**
     * Gets offset.
     * @param  integer $offset Offset 
     * @return mixed 
     */
    public function offsetGet($offset)
    {
        return $this->$offset;
    }
  
    /**
     * Sets value based on offset.
     * @param  integer $offset Offset 
     * @param  mixed   $value  Value to be set
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        $this->$offset = $value;
    }
  
    /**
     * Unsets offset.
     * @param  integer $offset Offset 
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->$offset);
    }
  
    /**
     * Gets the string presentation of the object
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) {
            return json_encode(get_object_vars($this), JSON_PRETTY_PRINT);
        } else {
            return json_encode(get_object_vars($this));
        }
    }
}