package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 部门
 */
@ApiModel(description = "部门")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-05T10:23:15.176+08:00")

public class Dept   {
  @JsonProperty("deptId")
  private String deptId = null;

  @JsonProperty("deptName")
  private String deptName = null;

  public Dept deptId(String deptId) {
    this.deptId = deptId;
    return this;
  }

   /**
   * 部门编号
   * @return deptId
  **/
  @ApiModelProperty(value = "部门编号")


  public String getDeptId() {
    return deptId;
  }

  public void setDeptId(String deptId) {
    this.deptId = deptId;
  }

  public Dept deptName(String deptName) {
    this.deptName = deptName;
    return this;
  }

   /**
   * 部门名称
   * @return deptName
  **/
  @ApiModelProperty(value = "部门名称")


  public String getDeptName() {
    return deptName;
  }

  public void setDeptName(String deptName) {
    this.deptName = deptName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dept dept = (Dept) o;
    return Objects.equals(this.deptId, dept.deptId) &&
        Objects.equals(this.deptName, dept.deptName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deptId, deptName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dept {\n");
    
    sb.append("    deptId: ").append(toIndentedString(deptId)).append("\n");
    sb.append("    deptName: ").append(toIndentedString(deptName)).append("\n");
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

