package com.as.mytool.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * <p>
 * 工具应用表
 * </p>
 *
 * @author fusheng
 * @since 2023-01-09
 */
@TableName("mytool_app")
public class MytoolApp implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * app标识
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * app名称
     */
    private String name;

    /**
     * 路由
     */
    private String route;

    /**
     * 描述
     */
    private String remark;

    /**
     * 创建时间
     */
    private LocalDate createTime;

    /**
     * 修改时间
     */
    private LocalDate modifyTime;

    /**
     * 排序
     */
    private Integer sort;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public LocalDate getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDate createTime) {
        this.createTime = createTime;
    }

    public LocalDate getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(LocalDate modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "MytoolApp{" +
            "id = " + id +
            ", name = " + name +
            ", route = " + route +
            ", remark = " + remark +
            ", createTime = " + createTime +
            ", modifyTime = " + modifyTime +
            ", sort = " + sort +
        "}";
    }
}
