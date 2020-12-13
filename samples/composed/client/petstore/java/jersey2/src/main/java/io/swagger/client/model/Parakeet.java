/*
 * Swagger Petstore
 * This is a sample Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/). 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Parakeet
 */


public class Parakeet implements AnyOfbody2, OneOfinlineResponse2001, AnyOfinlineResponseItems200 {
  @JsonProperty("color")
  private String color = null;

  @JsonProperty("soundRepeater")
  private Boolean soundRepeater = null;

  public Parakeet color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @Schema(description = "")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Parakeet soundRepeater(Boolean soundRepeater) {
    this.soundRepeater = soundRepeater;
    return this;
  }

   /**
   * Get soundRepeater
   * @return soundRepeater
  **/
  @Schema(description = "")
  public Boolean isSoundRepeater() {
    return soundRepeater;
  }

  public void setSoundRepeater(Boolean soundRepeater) {
    this.soundRepeater = soundRepeater;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Parakeet parakeet = (Parakeet) o;
    return Objects.equals(this.color, parakeet.color) &&
        Objects.equals(this.soundRepeater, parakeet.soundRepeater);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, soundRepeater);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Parakeet {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    soundRepeater: ").append(toIndentedString(soundRepeater)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}