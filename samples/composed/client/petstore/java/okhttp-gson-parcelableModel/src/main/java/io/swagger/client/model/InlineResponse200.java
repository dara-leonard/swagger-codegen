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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.InlineResponse2001;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;
/**
 * InlineResponse200
 */


public class InlineResponse200 implements Parcelable {
  @SerializedName("parrots")
  private List<InlineResponse2001> parrots = null;

  public InlineResponse200() {
  }
  public InlineResponse200 parrots(List<InlineResponse2001> parrots) {
    this.parrots = parrots;
    return this;
  }

  public InlineResponse200 addParrotsItem(InlineResponse2001 parrotsItem) {
    if (this.parrots == null) {
      this.parrots = new ArrayList<InlineResponse2001>();
    }
    this.parrots.add(parrotsItem);
    return this;
  }

   /**
   * Get parrots
   * @return parrots
  **/
  @Schema(description = "")
  public List<InlineResponse2001> getParrots() {
    return parrots;
  }

  public void setParrots(List<InlineResponse2001> parrots) {
    this.parrots = parrots;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.parrots, inlineResponse200.parrots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parrots);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    parrots: ").append(toIndentedString(parrots)).append("\n");
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


  public void writeToParcel(Parcel out, int flags) {
    out.writeValue(parrots);
  }

  InlineResponse200(Parcel in) {
    parrots = (List<InlineResponse2001>)in.readValue(InlineResponse2001.class.getClassLoader());
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<InlineResponse200> CREATOR = new Parcelable.Creator<InlineResponse200>() {
    public InlineResponse200 createFromParcel(Parcel in) {
      return new InlineResponse200(in);
    }
    public InlineResponse200[] newArray(int size) {
      return new InlineResponse200[size];
    }
  };
}