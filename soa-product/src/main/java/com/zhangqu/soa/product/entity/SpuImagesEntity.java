package com.zhangqu.soa.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spuͼƬ
 * 
 * @author zhangqu
 * @email 401168995@qq.com
 * @date 2020-09-01 15:08:29
 */
@Data
@TableName("pms_spu_images")
public class SpuImagesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Long id;
	/**
	 * $column.comments
	 */
	private Long spuId;
	/**
	 * $column.comments
	 */
	private String imgName;
	/**
	 * $column.comments
	 */
	private String imgUrl;
	/**
	 * $column.comments
	 */
	private Integer imgSort;
	/**
	 * $column.comments
	 */
	private Integer defaultImg;

}
