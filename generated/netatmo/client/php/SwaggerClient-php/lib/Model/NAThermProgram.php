<?php
/**
 * NAThermProgram
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
 * NAThermProgram Class Doc Comment
 *
 * @category    Class
 * @description 
 * @package     Swagger\Client
 * @author      http://github.com/swagger-api/swagger-codegen
 * @license     http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class NAThermProgram implements ArrayAccess
{
    /**
      * Array of property to type mappings. Used for (de)serialization 
      * @var string[]
      */
    static $swaggerTypes = array(
        'program_id' => 'string',
        'name' => 'string',
        'zones' => '\Swagger\Client\Model\NAZone[]',
        'timetable' => '\Swagger\Client\Model\NATimeTableItem[]',
        'selected' => 'bool'
    );
  
    /** 
      * Array of attributes where the key is the local name, and the value is the original name
      * @var string[] 
      */
    static $attributeMap = array(
        'program_id' => 'program_id',
        'name' => 'name',
        'zones' => 'zones',
        'timetable' => 'timetable',
        'selected' => 'selected'
    );
  
    /**
      * Array of attributes to setter functions (for deserialization of responses)
      * @var string[]
      */
    static $setters = array(
        'program_id' => 'setProgramId',
        'name' => 'setName',
        'zones' => 'setZones',
        'timetable' => 'setTimetable',
        'selected' => 'setSelected'
    );
  
    /**
      * Array of attributes to getter functions (for serialization of requests)
      * @var string[]
      */
    static $getters = array(
        'program_id' => 'getProgramId',
        'name' => 'getName',
        'zones' => 'getZones',
        'timetable' => 'getTimetable',
        'selected' => 'getSelected'
    );
  
    
    /**
      * $program_id 
      * @var string
      */
    protected $program_id;
    
    /**
      * $name 
      * @var string
      */
    protected $name;
    
    /**
      * $zones 
      * @var \Swagger\Client\Model\NAZone[]
      */
    protected $zones;
    
    /**
      * $timetable 
      * @var \Swagger\Client\Model\NATimeTableItem[]
      */
    protected $timetable;
    
    /**
      * $selected 
      * @var bool
      */
    protected $selected;
    

    /**
     * Constructor
     * @param mixed[] $data Associated array of property value initalizing the model
     */
    public function __construct(array $data = null)
    {
        if ($data != null) {
            $this->program_id = $data["program_id"];
            $this->name = $data["name"];
            $this->zones = $data["zones"];
            $this->timetable = $data["timetable"];
            $this->selected = $data["selected"];
        }
    }
    
    /**
     * Gets program_id
     * @return string
     */
    public function getProgramId()
    {
        return $this->program_id;
    }
  
    /**
     * Sets program_id
     * @param string $program_id 
     * @return $this
     */
    public function setProgramId($program_id)
    {
        
        $this->program_id = $program_id;
        return $this;
    }
    
    /**
     * Gets name
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }
  
    /**
     * Sets name
     * @param string $name 
     * @return $this
     */
    public function setName($name)
    {
        
        $this->name = $name;
        return $this;
    }
    
    /**
     * Gets zones
     * @return \Swagger\Client\Model\NAZone[]
     */
    public function getZones()
    {
        return $this->zones;
    }
  
    /**
     * Sets zones
     * @param \Swagger\Client\Model\NAZone[] $zones 
     * @return $this
     */
    public function setZones($zones)
    {
        
        $this->zones = $zones;
        return $this;
    }
    
    /**
     * Gets timetable
     * @return \Swagger\Client\Model\NATimeTableItem[]
     */
    public function getTimetable()
    {
        return $this->timetable;
    }
  
    /**
     * Sets timetable
     * @param \Swagger\Client\Model\NATimeTableItem[] $timetable 
     * @return $this
     */
    public function setTimetable($timetable)
    {
        
        $this->timetable = $timetable;
        return $this;
    }
    
    /**
     * Gets selected
     * @return bool
     */
    public function getSelected()
    {
        return $this->selected;
    }
  
    /**
     * Sets selected
     * @param bool $selected 
     * @return $this
     */
    public function setSelected($selected)
    {
        
        $this->selected = $selected;
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
