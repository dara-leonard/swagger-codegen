/*
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.19-SNAPSHOT
 *
 * Do not edit the class manually.
 *
 */

import {ApiClient} from '../ApiClient';
import {Animal} from './Animal';

/**
 * The Dog model module.
 * @module model/Dog
 * @version 1.0.0
 */
export class Dog extends Animal {
  /**
   * Constructs a new <code>Dog</code>.
   * @alias module:model/Dog
   * @class
   * @extends module:model/Animal
   * @param className {String} 
   */
  constructor(className) {
    super(className);
  }

  /**
   * Constructs a <code>Dog</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Dog} obj Optional instance to populate.
   * @return {module:model/Dog} The populated <code>Dog</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new Dog();
      Animal.constructFromObject(data, obj);
      if (data.hasOwnProperty('breed'))
        obj.breed = ApiClient.convertToType(data['breed'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} breed
 */
Dog.prototype.breed = undefined;


