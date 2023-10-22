package com.apply.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("访问人实体类")
public class Visitor implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键ID")
    private Long id;

    @ApiModelProperty("到访部门")
    private String VisitDepartment;

    @ApiModelProperty("审核人工号")
    private Long AuditLaborId;

    @ApiModelProperty("校内对接人")
    private String CampusContactPerson;

    @ApiModelProperty("访客姓名")
    private String VisitorName;

    @ApiModelProperty("证件号码")
    private String CardNumber;

    @ApiModelProperty("访客电话")
    private Integer VisitorPhone;

    @ApiModelProperty("访客单位")
    private String VisitorCompany;

    @ApiModelProperty("车牌号")
    private String CarNumber;

    @ApiModelProperty("到访日期")
    private LocalDate VisitDate;

    @ApiModelProperty("到访事由")
    private String VisitReason;
}
