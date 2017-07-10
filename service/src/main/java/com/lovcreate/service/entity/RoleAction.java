package com.lovcreate.service.entity;

public class RoleAction {

    /**
     * id
     */
    private Integer id;

    /**
     * 角色id
     */
    private Integer managerId;

    /**
     * 权限id
     */
    private Integer actionId;

    /**
     * 删除状态
     */
    private Integer delStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getActionId() {
        return actionId;
    }

    public void setActionId(Integer actionId) {
        this.actionId = actionId;
    }

    public Integer getDelStatus() {
        return delStatus;
    }

    public void setDelStatus(Integer delStatus) {
        this.delStatus = delStatus;
    }
}