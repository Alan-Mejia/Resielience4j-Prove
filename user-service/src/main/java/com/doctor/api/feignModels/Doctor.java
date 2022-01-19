package com.doctor.api.feignModels;

public class Doctor {

    private Long id;
    private Float fee;
    private Integer specialtyId;
    private Long userId;
    private Integer shiftId;
    private Integer status;

    public Doctor(Long id, Float fee, Integer specialtyId, Long userId, Integer shiftId, Integer status) {
        this.id = id;
        this.fee = fee;
        this.specialtyId = specialtyId;
        this.userId = userId;
        this.shiftId = shiftId;
        this.status = status;
    }

    public Doctor(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getFee() {
        return fee;
    }

    public void setFee(Float fee) {
        this.fee = fee;
    }

    public Integer getSpecialtyId() {
        return specialtyId;
    }

    public void setSpecialtyId(Integer specialtyId) {
        this.specialtyId = specialtyId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getShiftId() {
        return shiftId;
    }

    public void setShiftId(Integer shiftId) {
        this.shiftId = shiftId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


}
