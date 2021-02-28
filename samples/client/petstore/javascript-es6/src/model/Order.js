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

/**
 * The Order model module.
 * @module model/Order
 * @version 1.0.0
 */
export class Order {
  /**
   * Constructs a new <code>Order</code>.
   * @alias module:model/Order
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>Order</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Order} obj Optional instance to populate.
   * @return {module:model/Order} The populated <code>Order</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new Order();
      if (data.hasOwnProperty('id'))
        obj.id = ApiClient.convertToType(data['id'], 'Number');
      if (data.hasOwnProperty('petId'))
        obj.petId = ApiClient.convertToType(data['petId'], 'Number');
      if (data.hasOwnProperty('quantity'))
        obj.quantity = ApiClient.convertToType(data['quantity'], 'Number');
      if (data.hasOwnProperty('shipDate'))
        obj.shipDate = ApiClient.convertToType(data['shipDate'], 'Date');
      if (data.hasOwnProperty('status'))
        obj.status = ApiClient.convertToType(data['status'], 'String');
      if (data.hasOwnProperty('complete'))
        obj.complete = ApiClient.convertToType(data['complete'], 'Boolean');
    }
    return obj;
  }
}

/**
 * @member {Number} id
 */
Order.prototype.id = undefined;

/**
 * @member {Number} petId
 */
Order.prototype.petId = undefined;

/**
 * @member {Number} quantity
 */
Order.prototype.quantity = undefined;

/**
 * @member {Date} shipDate
 */
Order.prototype.shipDate = undefined;

/**
 * Allowed values for the <code>status</code> property.
 * @enum {String}
 * @readonly
 */
Order.StatusEnum = {
  /**
   * value: "placed"
   * @const
   */
  placed: "placed",

  /**
   * value: "approved"
   * @const
   */
  approved: "approved",

  /**
   * value: "delivered"
   * @const
   */
  delivered: "delivered"
};

/**
 * Order Status
 * @member {module:model/Order.StatusEnum} status
 */
Order.prototype.status = undefined;

/**
 * @member {Boolean} complete
 * @default false
 */
Order.prototype.complete = false;


