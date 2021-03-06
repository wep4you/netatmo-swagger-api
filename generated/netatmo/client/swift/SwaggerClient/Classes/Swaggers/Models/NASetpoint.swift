//
// NASetpoint.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class NASetpoint: JSONEncodable {

    public var setpoint_temp: Float?
    public var setpoint_endtime: Int?
    public var setpoint_mode: String?
    

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["setpoint_temp"] = self.setpoint_temp
        nillableDictionary["setpoint_endtime"] = self.setpoint_endtime
        nillableDictionary["setpoint_mode"] = self.setpoint_mode
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
