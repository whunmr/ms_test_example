package io.uber.model;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-01-08T12:46:14.936Z")
public class Activity  {
  
  private String uuid = null;

  
  /**
   * Unique identifier for the activity
   **/
  @ApiModelProperty(value = "Unique identifier for the activity")
  @JsonProperty("uuid")
  public String getUuid() {
    return uuid;
  }
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Activity {\n");
    
    sb.append("  uuid: ").append(uuid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
