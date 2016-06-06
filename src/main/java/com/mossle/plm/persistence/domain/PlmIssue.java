package com.mossle.plm.persistence.domain;

// Generated by Hibernate Tools
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PlmIssue .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "PLM_ISSUE")
public class PlmIssue implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private PlmProject plmProject;

    /** null. */
    private PlmSprint plmSprint;

    /** null. */
    private String type;

    /** null. */
    private String name;

    /** null. */
    private String content;

    /** null. */
    private Integer severity;

    /** null. */
    private Date createTime;

    /** null. */
    private Date startTime;

    /** null. */
    private Date completeTime;

    /** null. */
    private String reporterId;

    /** null. */
    private String assigneeId;

    /** null. */
    private String status;

    /** null. */
    private String step;

    /** . */
    private Set<PlmLog> plmLogs = new HashSet<PlmLog>(0);

    /** . */
    private Set<PlmComment> plmComments = new HashSet<PlmComment>(0);

    /** . */
    private Set<PlmVersion> plmVersions = new HashSet<PlmVersion>(0);

    /** . */
    private Set<PlmComponent> plmComponents = new HashSet<PlmComponent>(0);

    public PlmIssue() {
    }

    public PlmIssue(Long id) {
        this.id = id;
    }

    public PlmIssue(Long id, PlmProject plmProject, PlmSprint plmSprint,
            String type, String name, String content, Integer severity,
            Date createTime, Date startTime, Date completeTime,
            String reporterId, String assigneeId, String status, String step,
            Set<PlmLog> plmLogs, Set<PlmComment> plmComments,
            Set<PlmVersion> plmVersions, Set<PlmComponent> plmComponents) {
        this.id = id;
        this.plmProject = plmProject;
        this.plmSprint = plmSprint;
        this.type = type;
        this.name = name;
        this.content = content;
        this.severity = severity;
        this.createTime = createTime;
        this.startTime = startTime;
        this.completeTime = completeTime;
        this.reporterId = reporterId;
        this.assigneeId = assigneeId;
        this.status = status;
        this.step = step;
        this.plmLogs = plmLogs;
        this.plmComments = plmComments;
        this.plmVersions = plmVersions;
        this.plmComponents = plmComponents;
    }

    /** @return null. */
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            null.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return null. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PROJECT_ID")
    public PlmProject getPlmProject() {
        return this.plmProject;
    }

    /**
     * @param plmProject
     *            null.
     */
    public void setPlmProject(PlmProject plmProject) {
        this.plmProject = plmProject;
    }

    /** @return null. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SPRINT_ID")
    public PlmSprint getPlmSprint() {
        return this.plmSprint;
    }

    /**
     * @param plmSprint
     *            null.
     */
    public void setPlmSprint(PlmSprint plmSprint) {
        this.plmSprint = plmSprint;
    }

    /** @return null. */
    @Column(name = "TYPE", length = 50)
    public String getType() {
        return this.type;
    }

    /**
     * @param type
     *            null.
     */
    public void setType(String type) {
        this.type = type;
    }

    /** @return null. */
    @Column(name = "NAME", length = 200)
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     *            null.
     */
    public void setName(String name) {
        this.name = name;
    }

    /** @return null. */
    @Column(name = "CONTENT", length = 65535)
    public String getContent() {
        return this.content;
    }

    /**
     * @param content
     *            null.
     */
    public void setContent(String content) {
        this.content = content;
    }

    /** @return null. */
    @Column(name = "SEVERITY")
    public Integer getSeverity() {
        return this.severity;
    }

    /**
     * @param severity
     *            null.
     */
    public void setSeverity(Integer severity) {
        this.severity = severity;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_TIME", length = 26)
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * @param createTime
     *            null.
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "START_TIME", length = 26)
    public Date getStartTime() {
        return this.startTime;
    }

    /**
     * @param startTime
     *            null.
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "COMPLETE_TIME", length = 26)
    public Date getCompleteTime() {
        return this.completeTime;
    }

    /**
     * @param completeTime
     *            null.
     */
    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }

    /** @return null. */
    @Column(name = "REPORTER_ID", length = 64)
    public String getReporterId() {
        return this.reporterId;
    }

    /**
     * @param reporterId
     *            null.
     */
    public void setReporterId(String reporterId) {
        this.reporterId = reporterId;
    }

    /** @return null. */
    @Column(name = "ASSIGNEE_ID", length = 64)
    public String getAssigneeId() {
        return this.assigneeId;
    }

    /**
     * @param assigneeId
     *            null.
     */
    public void setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId;
    }

    /** @return null. */
    @Column(name = "STATUS", length = 50)
    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     *            null.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** @return null. */
    @Column(name = "STEP", length = 50)
    public String getStep() {
        return this.step;
    }

    /**
     * @param step
     *            null.
     */
    public void setStep(String step) {
        this.step = step;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "plmIssue")
    public Set<PlmLog> getPlmLogs() {
        return this.plmLogs;
    }

    /**
     * @param plmLogs
     *            .
     */
    public void setPlmLogs(Set<PlmLog> plmLogs) {
        this.plmLogs = plmLogs;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "plmIssue")
    public Set<PlmComment> getPlmComments() {
        return this.plmComments;
    }

    /**
     * @param plmComments
     *            .
     */
    public void setPlmComments(Set<PlmComment> plmComments) {
        this.plmComments = plmComments;
    }

    /** @return . */
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "PLM_ISSUE_VERSION", joinColumns = { @JoinColumn(name = "ISSUE_ID", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "VERSION_ID", nullable = false, updatable = false) })
    public Set<PlmVersion> getPlmVersions() {
        return this.plmVersions;
    }

    /**
     * @param plmVersions
     *            .
     */
    public void setPlmVersions(Set<PlmVersion> plmVersions) {
        this.plmVersions = plmVersions;
    }

    /** @return . */
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "PLM_ISSUE_COMPONENT", joinColumns = { @JoinColumn(name = "ISSUE_ID", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "COMPONENT_ID", nullable = false, updatable = false) })
    public Set<PlmComponent> getPlmComponents() {
        return this.plmComponents;
    }

    /**
     * @param plmComponents
     *            .
     */
    public void setPlmComponents(Set<PlmComponent> plmComponents) {
        this.plmComponents = plmComponents;
    }
}