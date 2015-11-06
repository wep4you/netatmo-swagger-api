// APIs.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation

public class SwaggerClientAPI {
    static let basePath = "https://api.netatmo.net/"
    static var credential: NSURLCredential?
    static var requestBuilderFactory: RequestBuilderFactory = AlamofireRequestBuilderFactory()
}

public class APIBase {
    func toParameters(encodable: JSONEncodable?) -> [String: AnyObject]? {
        let encoded: AnyObject? = encodable?.encodeToJSON()

        if encoded! is [AnyObject] {
            var dictionary = [String:AnyObject]()
            for (index, item) in (encoded as! [AnyObject]).enumerate() {
                dictionary["\(index)"] = item
            }
            return dictionary
        } else {
            return encoded as? [String:AnyObject]
        }
    }
}

public class RequestBuilder<T> {
    var credential: NSURLCredential?
    var headers: [String:String] = [:]
    let parameters: [String:AnyObject]?
    let isBody: Bool
    let method: String
    let URLString: String
    
    required public init(method: String, URLString: String, parameters: [String:AnyObject]?, isBody: Bool) {
        self.method = method
        self.URLString = URLString
        self.parameters = parameters
        self.isBody = isBody
    }
    
    public func execute(completion: (response: Response<T>?, erorr: ErrorType?) -> Void) { }

    public func addHeader(name name: String, value: String) -> Self {
        if !value.isEmpty {
            headers[name] = value
        }
        return self
    }
    
    public func addCredential() -> Self {
        self.credential = SwaggerClientAPI.credential
        return self
    }
}

protocol RequestBuilderFactory {
    func getBuilder<T>() -> RequestBuilder<T>.Type
}
