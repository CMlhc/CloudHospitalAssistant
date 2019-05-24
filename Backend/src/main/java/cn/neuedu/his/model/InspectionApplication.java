package cn.neuedu.his.model;

import javax.persistence.*;
import java.util.Date;

@Table(name = "inspection_application")
public class InspectionApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "medical_record_id")
    private Integer medicalRecordId;

    @Column(name = "non_drug_id")
    private Integer nonDrugId;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "is_done")
    private Boolean isDone;

    private Integer quantity;

    @Column(name = "is_canceled")
    private Boolean isCanceled;

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
     * @return medical_record_id
     */
    public Integer getMedicalRecordId() {
        return medicalRecordId;
    }

    /**
     * @param medicalRecordId
     */
    public void setMedicalRecordId(Integer medicalRecordId) {
        this.medicalRecordId = medicalRecordId;
    }

    /**
     * @return non_drug_id
     */
    public Integer getNonDrugId() {
        return nonDrugId;
    }

    /**
     * @param nonDrugId
     */
    public void setNonDrugId(Integer nonDrugId) {
        this.nonDrugId = nonDrugId;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return is_done
     */
    public Boolean getIsDone() {
        return isDone;
    }

    /**
     * @param isDone
     */
    public void setIsDone(Boolean isDone) {
        this.isDone = isDone;
    }

    /**
     * @return quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * @param quantity
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * @return is_canceled
     */
    public Boolean getIsCanceled() {
        return isCanceled;
    }

    /**
     * @param isCanceled
     */
    public void setIsCanceled(Boolean isCanceled) {
        this.isCanceled = isCanceled;
    }
}