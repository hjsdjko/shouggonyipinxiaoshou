package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 手工艺品求购
 *
 * @author 
 * @email
 */
@TableName("qiugou")
public class QiugouEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public QiugouEntity() {

	}

	public QiugouEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 手工艺品名称
     */
    @TableField(value = "qiugou_name")

    private String qiugouName;


    /**
     * 手工艺品类型
     */
    @TableField(value = "goods_types")

    private Integer goodsTypes;


    /**
     * 求购价格
     */
    @TableField(value = "qiugou_new_money")

    private Double qiugouNewMoney;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：手工艺品名称
	 */
    public String getQiugouName() {
        return qiugouName;
    }
    /**
	 * 获取：手工艺品名称
	 */

    public void setQiugouName(String qiugouName) {
        this.qiugouName = qiugouName;
    }
    /**
	 * 设置：手工艺品类型
	 */
    public Integer getGoodsTypes() {
        return goodsTypes;
    }
    /**
	 * 获取：手工艺品类型
	 */

    public void setGoodsTypes(Integer goodsTypes) {
        this.goodsTypes = goodsTypes;
    }
    /**
	 * 设置：求购价格
	 */
    public Double getQiugouNewMoney() {
        return qiugouNewMoney;
    }
    /**
	 * 获取：求购价格
	 */

    public void setQiugouNewMoney(Double qiugouNewMoney) {
        this.qiugouNewMoney = qiugouNewMoney;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Qiugou{" +
            "id=" + id +
            ", qiugouName=" + qiugouName +
            ", goodsTypes=" + goodsTypes +
            ", qiugouNewMoney=" + qiugouNewMoney +
            ", yonghuId=" + yonghuId +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
