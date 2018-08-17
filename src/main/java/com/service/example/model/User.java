package com.service.example.model;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 陈辉[of2547]
 *         company qianmi.com
 *         Date    2018/8/17
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class User implements Serializable {

    private static final long serialVersionUID = -4410352089134349483L;
    private String name;
}
