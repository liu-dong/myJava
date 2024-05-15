package com.dong;

/**
 * @author liudong 2024/5/15
 */
public class Relation {

    /**
     * 源类型
     */
    private String sourceType;

    /**
     * 源id
     */
    private String sourceId;

    /**
     * 关联类型
     */
    private String relationType;

    /**
     * 关联id
     */
    private String relationId;

    public Relation(String sourceType, String sourceId, String relationType, String relationId) {
        this.sourceType = sourceType;
        this.sourceId = sourceId;
        this.relationType = relationType;
        this.relationId = relationId;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getRelationType() {
        return relationType;
    }

    public void setRelationType(String relationType) {
        this.relationType = relationType;
    }

    public String getRelationId() {
        return relationId;
    }

    public void setRelationId(String relationId) {
        this.relationId = relationId;
    }
}
