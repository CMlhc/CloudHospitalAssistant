package cn.neuedu.his.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 职称,参照常量表
     */
    @Column(name = "title_id")
    private Integer titleId;

    /**
     * 是否排班
     */
    @Column(name = "can_arrange")
    private Boolean canArrange;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取职称,参照常量表
     *
     * @return title_id - 职称,参照常量表
     */
    public Integer getTitleId() {
        return titleId;
    }

    /**
     * 设置职称,参照常量表
     *
     * @param titleId 职称,参照常量表
     */
    public void setTitleId(Integer titleId) {
        this.titleId = titleId;
    }

    /**
     * 获取是否排班
     *
     * @return can_arrange - 是否排班
     */
    public Boolean getCanArrange() {
        return canArrange;
    }

    /**
     * 设置是否排班
     *
     * @param canArrange 是否排班
     */
    public void setCanArrange(Boolean canArrange) {
        this.canArrange = canArrange;
    }
}