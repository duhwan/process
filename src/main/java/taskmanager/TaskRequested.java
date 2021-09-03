package taskmanager;

import java.util.Date;

public class TaskRequested extends AbstractEvent {

    private Long id;
    private Long requesterId;
    private String requesterName;
    private String taskContents;
    private Date dueDate;
    private Long processTaskManagerId;
    private String processTaskManagerName;
    private String taskStatus;

    public TaskRequested(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getRequesterId() {
        return requesterId;
    }

    public void setRequesterId(Long requesterId) {
        this.requesterId = requesterId;
    }
    public String getRequesterName() {
        return requesterName;
    }

    public void setRequesterName(String requesterName) {
        this.requesterName = requesterName;
    }

    public String getTaskContents() {
        return taskContents;
    }

    public void setTaskContents(String taskContents) {
        this.taskContents = taskContents;
    }
    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    public Long getProcessTaskManagerId() {
        return processTaskManagerId;
    }

    public void setProcessTaskManagerId(Long processTaskManagerId) {
        this.processTaskManagerId = processTaskManagerId;
    }
    public String getProcessTaskManagerName() {
        return processTaskManagerName;
    }

    public void setTaskManagerName(String processTaskManagerName) {
        this.processTaskManagerName = processTaskManagerName;
    }
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }
}

