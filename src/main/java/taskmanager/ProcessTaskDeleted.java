package taskmanager;
import java.util.Date;
public class ProcessTaskDeleted extends AbstractEvent {

    private Long id;
    private Long requestTaskId;
    private String taskContents;
    private Date Date;
    private Date startDate;
    private Date completeDate;
    private Long processTaskManagerId;
    private String status;

    public ProcessTaskDeleted(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getRequestTaskId() {
        return requestTaskId;
    }

    public void setRequestTaskId(Long requestTaskId) {
        this.requestTaskId = requestTaskId;
    }
    public String getTaskContents() {
        return taskContents;
    }

    public void setTaskContents(String taskContents) {
        this.taskContents = taskContents;
    }
    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getCompleteDate() {
        return completeDate;
    }

    public void setCompleteDate(Date completeDate) {
        this.completeDate = completeDate;
    }
    public Long getProcessTaskManagerId() {
        return processTaskManagerId;
    }

    public void setProcessTaskManagerId(Long processTaskManagerId) {
        this.processTaskManagerId = processTaskManagerId;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
